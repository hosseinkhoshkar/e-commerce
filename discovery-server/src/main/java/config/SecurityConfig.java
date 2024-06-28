package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig /*extends WebSecurityConfigurerAdapter*/ {

    @Value("${EUREKA_USERNAME}")
    private String username;
    @Value("${EUREKA_PASSWORD}")
    private String password;

    //fixme : you should replace this methods by correct version
//    @Override
//    public void configurer(AuthenticationManagerBuilder authenticationManagerBuilder){
//        authenticationManagerBuilder.inMemoryAuthentication()
//                .passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .withUser(username).password(password)
//                .authorities("USER");
//    }
//
//    @Override
//    public void configure(HttpSecurity httpSecurity) throws Exception{
//        httpSecurity.csrf().disable()
//                .authorizeRequests().anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
//    }


}
