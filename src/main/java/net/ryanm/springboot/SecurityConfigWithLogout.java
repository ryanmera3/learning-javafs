package net.ryanm.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration
public class SecurityConfigWithLogout {

    private final LogoutHandler logoutHandler;

    public SecurityConfigWithLogout(LogoutHandler logoutHandler) {
        this.logoutHandler = logoutHandler;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .oauth2Login()
            .and().logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .addLogoutHandler(logoutHandler);
        return http.build();
    }
}