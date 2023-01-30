package com.goodroots.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyConfiguration {

	@Bean
	SecurityFilterChain filterChain(HttpSecurity https) throws Exception {
		https.cors().and().csrf().disable().authorizeHttpRequests().requestMatchers(HttpMethod.POST, "/studetns/add")
				.hasRole("ADMIN").anyRequest().authenticated();

		https.httpBasic();

		return https.build();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
