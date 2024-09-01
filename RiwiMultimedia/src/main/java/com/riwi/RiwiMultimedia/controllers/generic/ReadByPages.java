package com.riwi.RiwiMultimedia.controllers.generic;


import com.riwi.RiwiMultimedia.entities.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ReadByPages<Entity> {
    ResponseEntity<List<Student>> readByPages(int page, int size);
}
