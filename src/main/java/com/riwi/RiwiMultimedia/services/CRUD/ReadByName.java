package com.riwi.RiwiMultimedia.services.CRUD;

public interface ReadByName<Entity, NAME>{
    public Entity readByName(NAME name);
}
