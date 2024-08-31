package com.riwi.RiwiMultimedia.services.CRUD;


import com.riwi.RiwiMultimedia.entities.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ReadByPages<Entity> {
    ResponseEntity<List<Entity>> readByPages(int page, int size);
}
