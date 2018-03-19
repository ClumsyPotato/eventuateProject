package com.thesis.CustomerServiceEventuate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CustomerQueryObject {

    @Id
   // @GeneratedValue
    private UUID id;
   // private UUID cuId;
    @Column
    private String name;
    @Column
    private int balance;


    public CustomerQueryObject(){}

    public CustomerQueryObject(UUID id, String name, int balance){

       this.id = id;
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
