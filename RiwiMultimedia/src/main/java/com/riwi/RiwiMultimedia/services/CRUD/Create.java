package com.riwi.RiwiMultimedia.services.CRUD;

import org.springframework.http.ResponseEntity;

public interface Create<Entity> {
    public Entity create(Entity entity);
}
