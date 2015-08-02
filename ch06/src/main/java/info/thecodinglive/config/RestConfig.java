package info.thecodinglive.config;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"info.thecodinglive.restController"}, useDefaultFilters = false, includeFilters= {@Filter(Controller.class)})
public class RestConfig extends WebMvcConfigurerAdapter{
	
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters){
		converters.add(mappingJackson2HttpMessageConverter());
		
	}
	
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		
		return converter;
	}

}
