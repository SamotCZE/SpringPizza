package com.springinaction.pizza.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter  {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		/*
		http
		.authorizeRequests()
			.antMatchers("/spitter/me").hasRole("SPITTER")
			.antMatchers(HttpMethod.POST, "/spittles").hasRole("SPITTER")
			.anyRequest().permitAll()
		.and()
		.requiresChannel()
			.antMatchers("/spitter/form").requiresSecure()
			.antMatchers("/").requiresInsecure();
		*/
		
		http
			.authorizeRequests()
				.anyRequest().authenticated()
				.and()
			.formLogin().and()
			.httpBasic()
			.and().logout();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		
		/*
		auth
			.ldapAuthentication()
				.userSearchBase("ou=people")
				.userSearchFilter("(uid={0})")
				.groupSearchBase("ou=groups")
				.groupSearchFilter("member={0}")
				.contextSource()
					.root("dc=hudydev,dc=com");		
		*/
		
		auth
			.inMemoryAuthentication()
				.withUser("user").password("password").roles("USER").and()
				.withUser("admin").password("password").roles("USER", "ADMIN");
		
	}

	
	
	
}
