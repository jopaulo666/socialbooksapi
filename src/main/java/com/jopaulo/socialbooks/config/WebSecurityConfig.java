package com.jopaulo.socialbooks.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity // segurança web
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired // injeção de depedências
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("joao").password("{noop}1234").roles("USER");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/h2-console/**").permitAll().anyRequest().authenticated().and().httpBasic().and().csrf().disable();
	}

}
