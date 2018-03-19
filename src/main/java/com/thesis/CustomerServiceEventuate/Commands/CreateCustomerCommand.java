package com.thesis.CustomerServiceEventuate.Commands;

import java.util.UUID;

public class CreateCustomerCommand implements CustomerCommand {

    private final UUID cuId;
    private final String name;
    private final int balance;


    public CreateCustomerCommand(UUID id, String name, int balance){
        this.cuId = id;
        this.name = name;
        this.balance = balance;
    }


    public UUID getId() {
        return cuId;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

}
