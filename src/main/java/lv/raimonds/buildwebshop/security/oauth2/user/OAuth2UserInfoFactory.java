package lv.raimonds.buildwebshop.security.oauth2.user;

import lv.raimonds.buildwebshop.exception.OAuth2AuthenticationProcessingException;
import lv.raimonds.buildwebshop.model.AuthProvider;
import lv.raimonds.buildwebshop.security.oauth2.user.GithubOAuth2UserInfo;
import lv.raimonds.buildwebshop.security.oauth2.user.OAuth2UserInfo;

import java.util.Map;

public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(String registrationId, Map<String, Object> attributes) {
        if (registrationId.equalsIgnoreCase(AuthProvider.github.toString())) {
            return new GithubOAuth2UserInfo(attributes);
        } else {
            throw new OAuth2AuthenticationProcessingException("Sorry! Login with " + registrationId + " is not supported yet.");
        }
    }
}
