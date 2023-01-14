package com.backend.portfolio.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SpringSecurity {

    @Bean
    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // configure SecurityFilterChain
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/registration/**").permitAll()
                .antMatchers("/login/**").permitAll()
                //.antMatchers("/actualizar/**").permitAll()
                .antMatchers("/delete/**").permitAll()
                .antMatchers("/ver/**").permitAll()
                
                .antMatchers("/user/**").hasAnyRole("USER", "ADMIN")
                .antMatchers("/admin/**").hasAnyRole("ADMIN")
                .antMatchers("/actualizar/**").hasAnyRole("USER","ADMIN")
                //.antMatchers("/informacion/delete/**").hasAnyRole("USER","ADMIN")
                //.antMatchers("/new/**").hasAnyRole("USER","ADMIN")
                //.antMatchers("/delete/**").hasAnyRole("USER","ADMIN")
                //.antMatchers("/actualizar/**").hasAnyRole("USER","ADMIN")
                
               
                
                .and()
                .formLogin(
                        form -> form
                                .loginPage("/login")
                                .loginProcessingUrl("/login")
                                .defaultSuccessUrl("//localhost:4200/backoffice")
                                .permitAll()
                ).logout(
                        logout -> logout
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                                .permitAll()

                );
        return http.build();
    }
}
