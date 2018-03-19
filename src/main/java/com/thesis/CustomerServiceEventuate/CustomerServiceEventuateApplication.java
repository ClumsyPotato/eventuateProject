package com.thesis.CustomerServiceEventuate;

import com.thesis.CustomerServiceEventuate.Commands.CreateCustomerCommand;
import com.thesis.CustomerServiceEventuate.Commands.CustomerCommand;
import io.eventuate.AggregateRepository;
import io.eventuate.EventuateAggregateStore;
import io.eventuate.javaclient.driver.EventuateDriverConfiguration;
import io.eventuate.javaclient.spring.EnableEventHandlers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.context.request.RequestContextListener;


@Configuration
@Import({ConfigClass.class,EventuateDriverConfiguration.class})
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class CustomerServiceEventuateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceEventuateApplication.class, args);



	}





}


