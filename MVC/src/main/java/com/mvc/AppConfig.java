package com.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Locale;

@Configuration
//@EnableWebMvc
//@ComponentScan("com.mvc.controller")
public class AppConfig {

    // i18n
//    @Bean("customLocaleChangeInterceptor")
//    public LocaleChangeInterceptor localeChangeInterceptor() {
//        LocaleChangeInterceptor changeInterceptor = new LocaleChangeInterceptor();
//        changeInterceptor.setParamName("lang");
//
//        return changeInterceptor;
//    }

    // i18n
//    @Bean("customLocaleResolver")
//    public LocaleResolver localeResolver() {
//        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//        localeResolver.setDefaultLocale(Locale.US);
//
//        return localeResolver;
//    }

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver myResolver = new InternalResourceViewResolver();

        myResolver.setPrefix("/WEB-INF/jsp/");
        myResolver.setSuffix(".jsp");
        // To order it for controller
        /*
         * Specify the order value for this ViewResolver bean.
         * The default value is Ordered.LOWEST_PRECEDENCE, meaning non-ordered.
         * */
//        myResolver.setOrder(0);

        return myResolver;
    }

//    @Bean(name = "multipartResolver")
//    public CommonsMultipartResolver multipartResolver() {
//        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
////        multipartResolver.setMaxUploadSize(200000);
////        multipartResolver.setMaxUploadSizePerFile(10000);
//
//        return multipartResolver;
//    }
}
