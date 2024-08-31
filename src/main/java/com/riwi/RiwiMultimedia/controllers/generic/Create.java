package com.riwi.RiwiMultimedia.controllers.generic;

import org.springframework.http.ResponseEntity;

public interface Create<EntityRequest, Entity> {
    public ResponseEntity<Entity> create(EntityRequest entity);
}
