package lv.raimonds.buildwebshop;

import lv.raimonds.buildwebshop.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class BuildwebshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildwebshopApplication.class, args);
	}

}
