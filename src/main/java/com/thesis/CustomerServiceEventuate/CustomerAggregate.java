package com.thesis.CustomerServiceEventuate;

import com.thesis.CustomerServiceEventuate.Commands.CreateCustomerCommand;
import com.thesis.CustomerServiceEventuate.Commands.CustomerCommand;
import com.thesis.CustomerServiceEventuate.Events.CustomerCreatedEvent;
import io.eventuate.CommandProcessingAggregate;
import io.eventuate.Event;
import io.eventuate.EventUtil;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;

import java.util.List;
import java.util.UUID;

public class CustomerAggregate extends ReflectiveMutableCommandProcessingAggregate<CustomerAggregate,CustomerCommand>{

    private UUID id;
    private String name;
    private int balance;


    public List<Event> process(CreateCustomerCommand command){
        System.out.println("[LOG] eventprocessor called");
        return EventUtil.events(new CustomerCreatedEvent(command.getId(),command.getName(),command.getBalance()));
    }

    public void apply(CustomerCreatedEvent event){
        System.out.println("Is this called?");
        balance = event.getBalance();
    }


    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
}
