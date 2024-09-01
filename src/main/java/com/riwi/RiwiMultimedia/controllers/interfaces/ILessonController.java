package com.riwi.RiwiMultimedia.controllers.interfaces;

import com.riwi.RiwiMultimedia.entities.Lesson;
import com.riwi.RiwiMultimedia.controllers.generic.Create;
import com.riwi.RiwiMultimedia.controllers.generic.ReadById;
import com.riwi.RiwiMultimedia.controllers.generic.Disable;
import org.springframework.http.ResponseEntity;

public interface ILessonController extends
        Create<Lesson>,
        ReadById<Lesson, Integer>,
        Disable<Integer, Lesson> {

    ResponseEntity<Lesson> getLessonWithMultimedia(Integer id);
}
