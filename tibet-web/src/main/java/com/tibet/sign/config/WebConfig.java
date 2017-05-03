package com.tibet.sign.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

import com.tibet.sign.common.filter.SecurityFilter;
import com.tibet.sign.common.interceptor.SessionInterceptor;

@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = { "classpath:/WEB-INF/static/",
            "classpath:/resources/", "classpath:/static/", "classpath:/public/" };

    @Bean
    public UrlBasedViewResolver tilesViewResolver() {

        UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
        tilesViewResolver.setViewClass(TilesView.class);
        return tilesViewResolver;
    }

    /**
     * tiles設定
     */
    @Bean
    public TilesConfigurer tilesConfigurer() {

        TilesConfigurer tconf = new TilesConfigurer();
        tconf.setDefinitions(new String[] { "/WEB-INF/tiles/tiles.xml" });
        return tconf;
    }

    /**
     * filter 設定
     * 
     */
    @Bean
    public FilterRegistrationBean filterRegistration() {

        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new SecurityFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("paramName", "paramValue");
        registration.setName("LoginFilter");
        registration.setOrder(1);
        return registration;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
         // addPathPatterns ルート追加
         registry.addInterceptor(new
        		 SessionInterceptor()).addPathPatterns("/**");
         super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
        super.addResourceHandlers(registry);
    }

}
