package com.riwi.RiwiMultimedia.controllers.generic;

import com.riwi.RiwiMultimedia.entities.Student;
import org.springframework.http.ResponseEntity;

public interface Update<ID, Entity> {
    public ResponseEntity<Student> update(ID id, Entity entity);
}
