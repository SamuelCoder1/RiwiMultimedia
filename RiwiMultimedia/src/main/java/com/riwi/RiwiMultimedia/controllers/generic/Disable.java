package com.riwi.RiwiMultimedia.controllers.generic;

import org.springframework.http.ResponseEntity;

public interface Disable<ID, Entity> {
    ResponseEntity<Entity> disable(ID id);
}
