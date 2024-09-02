package com.riwi.RiwiMultimedia.controllers.interfaces;

import com.riwi.RiwiMultimedia.entities.Class;
import com.riwi.RiwiMultimedia.repositories.interfaces.ClassesRepository;
import com.riwi.RiwiMultimedia.services.CRUD.Create;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByDescription;
import com.riwi.RiwiMultimedia.services.CRUD.ReadById;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByName;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IClassController extends
        ReadById<Class, Integer>,
        ReadByName<Class, String>,
        ReadByDescription<Class, String>,
        Create<Class> {
    ResponseEntity<List<Class>> readByPages(int page, int size);
}
