package com.thesis.CustomerServiceEventuate;

import io.eventuate.EntityWithIdAndVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@RestController
public class Controller{

    @Autowired
    private CustomerService customerService;

    @PostMapping("create/{name}/{balance}")
    public UUID createCustomer(@PathVariable("name") String name, @PathVariable("balance") int balance){
        UUID id = UUID.randomUUID();
        System.out.println("[LOG] Customer created with id:" + id);
         customerService.createAccount(id,name,balance);
        return id;
    }

}
