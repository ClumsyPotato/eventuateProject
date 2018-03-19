package com.thesis.CustomerServiceEventuate.Events;

import io.eventuate.EventEntity;

import java.util.UUID;

@EventEntity(entity = "com.thesis.CustomerServiceEventuate.CustomerAggregate")
public class CustomerCreatedEvent implements CustomerEvent {

    private  UUID id;
    private  String name;
    private  int balance;

    private CustomerCreatedEvent(){}

    public CustomerCreatedEvent(UUID id, String name, int balance){

        this.id =id;
        this.name = name;
        this.balance = balance;
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
