package info.thecodinglive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"info.thecodinglive.controller"} )

public class WebConfig extends WebMvcConfigurerAdapter{

	  @Override
	    public void addViewControllers( org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry){
		  registry.addViewController("/").setViewName("home");
		  registry.addViewController("/index").setViewName("home");
	    }
	  
	  @Override
	    public void addResourceHandlers( ResourceHandlerRegistry registry){
	        registry.addResourceHandler("/resources/*").addResourceLocations("/resources/");
	    }

	  @Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }
	  
	  @Override
	    public void addInterceptors( InterceptorRegistry registry){
	        LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
	        localeChangeInterceptor.setParamName("lang");
	        registry.addInterceptor(localeChangeInterceptor);
	    }
    
	  @Bean
	    public LocaleResolver localResolver(){
	        CookieLocaleResolver cookieLocaleResolver = new CookieLocaleResolver();
	        cookieLocaleResolver.setDefaultLocale(StringUtils.parseLocaleString("en"));

	        return cookieLocaleResolver;
	    }
	  
	 
    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);
        return resolver;
    }
		

}