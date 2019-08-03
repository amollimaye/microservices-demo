package com.okta.springbootwithauth.logging;
import com.okta.springbootwithauth.CorrelationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Amol Limaye
 **/
@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    CorrelationInterceptor correlationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(correlationInterceptor).addPathPatterns("/**/**/");;
    }
}
