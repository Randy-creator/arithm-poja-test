package hei.school.arithm.endpoint.event.consumer.model;

import hei.school.arithm.PojaGenerated;
import hei.school.arithm.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
