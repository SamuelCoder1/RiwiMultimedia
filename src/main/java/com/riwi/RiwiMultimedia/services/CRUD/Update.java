package com.riwi.RiwiMultimedia.services.CRUD;

import com.riwi.RiwiMultimedia.entities.Student;
import org.springframework.http.ResponseEntity;

public interface Update<ID, Entity> {
    public Entity update(ID id, Entity entity);
}
