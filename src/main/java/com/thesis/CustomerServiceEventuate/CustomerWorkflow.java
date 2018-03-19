package com.thesis.CustomerServiceEventuate;

import com.thesis.CustomerServiceEventuate.Commands.CreateCustomerCommand;
import com.thesis.CustomerServiceEventuate.Events.CustomerCreatedEvent;
import com.thesis.CustomerServiceEventuate.Events.CustomerEvent;
import io.eventuate.DispatchedEvent;
import io.eventuate.EventHandlerContext;
import io.eventuate.EventHandlerMethod;
import io.eventuate.EventSubscriber;

import java.util.concurrent.CompletableFuture;

@EventSubscriber(id="customerWorkflow")
public class CustomerWorkflow {


  //  private CustomerService customerService;

/*
    public CustomerWorkflow(CustomerService service){
        this.customerService = service;
    }
*/

    @EventHandlerMethod
    public void customerrr(DispatchedEvent<CustomerCreatedEvent> event){
        System.out.println("I have been called");

    }



 /*

 @EventHandlerMethod
    public void customerr(EventHandlerContext<CustomerCreatedEvent> event){

        System.out.println("I have been called");
    }

    @EventHandlerMethod
    public void customer(EventHandlerContext<CustomerEvent> event){

        System.out.println("I have been called");
    }




    @EventHandlerMethod
    public void customerrrr(DispatchedEvent<CustomerEvent> event){

        System.out.println("I have been called");
    }
*/
}
