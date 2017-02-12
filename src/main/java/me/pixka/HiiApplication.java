package me.pixka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import me.pixka.hii.config.JWF;

@SpringBootApplication
public class HiiApplication {

	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JWF());
		registrationBean.addUrlPatterns("/rest/*");

		return registrationBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(HiiApplication.class, args);
	}
}
