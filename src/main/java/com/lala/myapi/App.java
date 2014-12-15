package com.lala.myapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Hello world!
 *
 */
@ComponentScan("com")
@EnableJpaRepositories("com")
@Configuration
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
