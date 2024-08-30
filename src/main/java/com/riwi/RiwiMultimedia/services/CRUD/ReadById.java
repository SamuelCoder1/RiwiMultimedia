package com.riwi.RiwiMultimedia.services.CRUD;

public interface ReadById<Entity, ID> {
    public Entity readById(ID id);
}
