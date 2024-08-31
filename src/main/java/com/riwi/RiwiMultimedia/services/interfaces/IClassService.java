package com.riwi.RiwiMultimedia.services.interfaces;

import com.riwi.RiwiMultimedia.entities.Class;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByDescription;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByName;

public interface IClassService extends
        ReadByName<Class, String>,
        ReadByDescription<Class, String> {
}
