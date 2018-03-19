package com.thesis.CustomerServiceEventuate;

import com.thesis.CustomerServiceEventuate.Commands.CustomerCommand;
import io.eventuate.sync.AggregateRepository;
import io.eventuate.sync.EventuateAggregateStore;
import io.eventuate.javaclient.driver.EventuateDriverConfiguration;
import io.eventuate.javaclient.spring.EnableEventHandlers;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.context.request.RequestContextListener;

//@Import(EventuateDriverConfiguration.class)
@Configuration
@EntityScan("com.thesis.CustomerServiceEventuate")
@EnableJpaRepositories("com.thesis.CustomerServiceEventuate")
@EnableEventHandlers
public class ConfigClass {


    @Bean
    public CustomerWorkflow customerWorkflow(){
        return new CustomerWorkflow();
    }


    @Bean
    public ServletListenerRegistrationBean<RequestContextListener> httpRequestContextListener() {
        return new ServletListenerRegistrationBean<RequestContextListener>(new RequestContextListener());
    }


    @Bean
    public AggregateRepository<CustomerAggregate, CustomerCommand> aggregateRepository(EventuateAggregateStore eventStore){
        return new AggregateRepository<CustomerAggregate, CustomerCommand>(CustomerAggregate.class, eventStore);
    }       //



    @Bean
    public CustomerService updateService(AggregateRepository<CustomerAggregate, CustomerCommand> aggregateRepository) {
        return new CustomerService(aggregateRepository);
    }


    @Bean
    public HttpMessageConverters customConverters() {
        HttpMessageConverter<?> additional = new MappingJackson2HttpMessageConverter();
        return new HttpMessageConverters(additional);
    }


    /*
    @Bean
    public CustomerWorkflow customerWorkflow(CustomerService service){
        return new CustomerWorkflow(service);
    }
    */




}
