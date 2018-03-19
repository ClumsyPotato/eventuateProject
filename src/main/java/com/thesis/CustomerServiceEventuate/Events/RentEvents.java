package com.thesis.CustomerServiceEventuate.Events;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity ="com.thesis.RentServiceEventuate.RentAggregate")
public interface RentEvents extends Event{
}
