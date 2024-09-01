package com.riwi.RiwiMultimedia.services.interfaces;

import com.riwi.RiwiMultimedia.entities.Class;
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
}
