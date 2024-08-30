package com.riwi.RiwiMultimedia.controllers.generic;

import org.springframework.http.ResponseEntity;

public interface Create<Entity> {
    public ResponseEntity<Entity> create();
}
