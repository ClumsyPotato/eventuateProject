package com.thesis.CustomerServiceEventuate;

import com.thesis.CustomerServiceEventuate.Events.BalanceUpdatedEvent;
import com.thesis.CustomerServiceEventuate.Events.CustomerCreatedEvent;
import com.thesis.CustomerServiceEventuate.Events.RentEndedEvent;
import io.eventuate.DispatchedEvent;
import io.eventuate.EventHandlerContext;
import io.eventuate.EventHandlerMethod;
import io.eventuate.EventSubscriber;

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


    @EventHandlerMethod
    public void customerUpdated(EventHandlerContext<BalanceUpdatedEvent> event){
        System.out.println("[LOG] BalanceUpdated EventHandler called");
    }


    @EventHandlerMethod
    public void rentEnded(DispatchedEvent<RentEndedEvent> event){
        System.out.println("[LOG] rentEnded EventHandler called");
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
