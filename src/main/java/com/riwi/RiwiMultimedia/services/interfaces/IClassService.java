package com.riwi.RiwiMultimedia.services.interfaces;

import com.riwi.RiwiMultimedia.entities.Class;
<<<<<<< HEAD
import com.riwi.RiwiMultimedia.services.CRUD.Create;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByDescription;
import com.riwi.RiwiMultimedia.services.CRUD.ReadById;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByName;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClassService extends
        ReadByDescription<Class, String>,
        ReadByName<Class, String>,
        ReadById<Class, Integer>,
        Create<Class> {
    Page<Class> readByPages(Pageable pageable);
=======
import com.riwi.RiwiMultimedia.services.CRUD.ReadByDescription;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByName;

public interface IClassService extends
        ReadByName<Class, String>,
        ReadByDescription<Class, String> {
>>>>>>> 5b1ee6c456ca4d621d2d2e9ca96c434c8476dde0
}
