package com.thesis.CustomerServiceEventuate.Events;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.thesis.CustomerServiceEventuate.CustomerAggregate")
public interface CustomerEvent  extends Event{
}
