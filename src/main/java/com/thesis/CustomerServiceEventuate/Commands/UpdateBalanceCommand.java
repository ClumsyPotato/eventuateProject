package com.thesis.CustomerServiceEventuate.Commands;


import java.util.UUID;

public class UpdateBalanceCommand implements CustomerCommand {


    private UUID cuId;
    private UUID id;
    private UUID caId;
    private int time;
    private int distance;
    private int balance;
    private int fuel;


    public UpdateBalanceCommand(UUID id, UUID cuId, UUID caId, int time, int balance, int distance, int fuel) {
        this.id = id;
        this.cuId = cuId;
        this.caId = caId;
        this.time = time;
        this.balance = balance;
        this.distance = distance;
        this.fuel = fuel;
    }

    public UUID getId() {
        return id;
    }

    public int getBalance() {
        return balance;
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

    public UUID getCuId() {
        return cuId;
    }

    public int getTime() {
        return time;
    }
}
