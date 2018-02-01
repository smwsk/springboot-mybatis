package com.smu.hydm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Controller
@ServletComponentScan  
@EnableWebMvc  
@SpringBootApplication  
@MapperScan("com.smu.hydm.dao")
public class App 
{
	@ResponseBody
	@RequestMapping(value="/")
	public String home(){
		return "Hello World!";
	}
	
    public static void main( String[] args )
    {
     	SpringApplication.run(App.class, args);
    }
    
}
