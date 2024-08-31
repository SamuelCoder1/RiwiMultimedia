package com.riwi.RiwiMultimedia.services.interfaces;

import com.riwi.RiwiMultimedia.entities.Class;
import com.riwi.RiwiMultimedia.services.CRUD.ReadAll;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByDescription;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByName;

public interface IClassService extends
        ReadAll<Class>,
        ReadByName<Class, String>,
        ReadByDescription<Class, String> {
}
