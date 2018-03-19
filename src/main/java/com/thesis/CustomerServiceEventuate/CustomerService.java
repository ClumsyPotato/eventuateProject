package com.thesis.CustomerServiceEventuate;

import com.thesis.CustomerServiceEventuate.Commands.CreateCustomerCommand;
import com.thesis.CustomerServiceEventuate.Commands.CustomerCommand;
import io.eventuate.sync.AggregateRepository;
import io.eventuate.EntityWithIdAndVersion;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class CustomerService {

    private final AggregateRepository<CustomerAggregate,CustomerCommand> aggregateRepository;


    public CustomerService(AggregateRepository<CustomerAggregate, CustomerCommand> aggregateRepository) {
        this.aggregateRepository = aggregateRepository;
    }

    public EntityWithIdAndVersion<CustomerAggregate>
    createAccount(UUID id, String name, int balance){
        return aggregateRepository.save(new CreateCustomerCommand(id,name,balance));
    }


 /*   public CompletableFuture<EntityWithIdAndVersion<CustomerAggregate>>
    createAccount(UUID id, String name, int balance){
        return aggregateRepository.save(new CreateCustomerCommand(id,name,balance));
    }
*/



}



