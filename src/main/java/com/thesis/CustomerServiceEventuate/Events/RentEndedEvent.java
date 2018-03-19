package com.thesis.CustomerServiceEventuate.Events;

import java.util.UUID;

public class RentEndedEvent implements RentEvents{

    private UUID id;
    private UUID cuId;
    private UUID caId;
    private int time;
    private int distance;
    private int price;
    private int fuel;
    private String status;

    private RentEndedEvent(){}

    public RentEndedEvent(UUID id, UUID cuId, UUID caId, int time, int distance, int price, int fuel) {
        this.id = id;
        this.cuId = cuId;
        this.caId = caId;
        this.time = time;
        this.distance = distance;
        this.price = price;
        this.fuel = fuel;
        this.status = "processing";

    }

    public UUID getId() {
        return id;
    }

    public int getTime() {
        return time;
    }

    public int getDistance() {
        return distance;
    }

    public int getPrice() {
        return price;
    }

    public UUID getCuId() {
        return cuId;
    }

    public UUID getCaId() {
        return caId;
    }

    public int getFuel() {
        return fuel;
    }

    public String getStatus() {
        return status;
    }

}
