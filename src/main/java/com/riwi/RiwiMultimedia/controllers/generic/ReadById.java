package com.riwi.RiwiMultimedia.controllers.generic;

import org.springframework.http.ResponseEntity;

public interface ReadById<Entity, ID> {
    public Entity readById(ID id);
}
