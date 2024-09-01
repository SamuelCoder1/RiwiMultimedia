package com.riwi.RiwiMultimedia.services.CRUD;

import org.springframework.http.ResponseEntity;

public interface ReadById<Entity, ID> {
    public Entity readById(ID id);
}
