package org.example.spring_security_udemy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        /* 모든 url 인가 거부 */
        /*http.authorizeHttpRequests((requests) -> {
                    requests.anyRequest().denyAll();
                })
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        return (SecurityFilterChain)http.build();*/

        /* 모든 url 인가 허용 */
        /*http.authorizeHttpRequests((requests) -> {
                    requests.anyRequest().permitAll();
                })
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        return (SecurityFilterChain)http.build();*/


        http.authorizeHttpRequests((requests) -> {
                    requests.requestMatchers("/myAccount","/myBalance","/myLoans","/myCards").authenticated()
                            .requestMatchers("/notices","/contact").permitAll();
                })
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());

        return (SecurityFilterChain)http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("12345")
                .authorities("admin")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("12345")
                .authorities("read")
                .build();
                return new InMemoryUserDetailsManager(admin,user);
    }



}
