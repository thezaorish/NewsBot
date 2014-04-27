package com.zaorish.newsbot.config.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by zaorish on 4/27/14.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.zaorish.newsbot")
public class WebConfiguration extends WebMvcConfigurerAdapter {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Bean
    public ViewResolver viewResolver() {
        logger.info("Registering the view resolver started.");

        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/view/");
        bean.setSuffix(".jsp");

        logger.info("Registering the view resolver finished.");
        return bean;
    }

}
