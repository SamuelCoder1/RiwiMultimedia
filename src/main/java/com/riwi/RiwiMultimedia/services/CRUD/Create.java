package com.riwi.RiwiMultimedia.services.CRUD;

public interface Create<EntityRequest, Entity> {
    public Entity create(EntityRequest entity);
}
