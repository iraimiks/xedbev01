package lv.raimonds.buildwebshop.controller;

import lv.raimonds.buildwebshop.exception.ResourceNotFoundException;
import lv.raimonds.buildwebshop.model.User;
import lv.raimonds.buildwebshop.repository.UserRepository;
import lv.raimonds.buildwebshop.security.CurrentUser;
import lv.raimonds.buildwebshop.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
