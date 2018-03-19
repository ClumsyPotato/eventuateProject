package com.thesis.CustomerServiceEventuate.Events;

import java.util.UUID;

public class BalanceUpdatedEvent implements CustomerEvent{


    private UUID rId;
    private UUID cuId;
    private int bill;
    private UUID caId;
    private int balance;
    private int distance;
    private int fuel;


    public BalanceUpdatedEvent(UUID rId, UUID id, int balance, UUID caId, int distance, int fuel) {
        this.rId = rId;
        this.cuId = id;
        this.bill = balance;
        this.caId = caId;
        this.distance = distance;
        this.fuel = fuel;
    }

    public UUID getCuId() {
        return cuId;
    }

    public int getBill() {
        return bill;
    }

    public UUID getCaId() {
        return caId;
    }

    public int getDistance() {
        return distance;
    }

    public int getFuel() {
        return fuel;
    }

    public int getBalance() {
        return balance;
    }

    public UUID getrId() {
        return rId;
    }
}
