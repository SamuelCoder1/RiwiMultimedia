package com.riwi.RiwiMultimedia.controllers.generic;

import org.springframework.http.ResponseEntity;

<<<<<<< HEAD
public interface Create<Entity> {
    public ResponseEntity<Entity> create(Entity entity);
=======
public interface Create<EntityRequest, Entity> {
    public ResponseEntity<Entity> create(EntityRequest entity);
>>>>>>> 5b1ee6c456ca4d621d2d2e9ca96c434c8476dde0
}
