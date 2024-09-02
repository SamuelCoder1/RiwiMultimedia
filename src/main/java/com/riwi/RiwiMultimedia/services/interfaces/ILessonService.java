package com.riwi.RiwiMultimedia.services.interfaces;

import com.riwi.RiwiMultimedia.entities.Lesson;
import com.riwi.RiwiMultimedia.services.CRUD.Create;
import com.riwi.RiwiMultimedia.services.CRUD.ReadById;
import com.riwi.RiwiMultimedia.services.CRUD.Disable;

public interface ILessonService extends
        Create<Lesson>,
        ReadById<Lesson, Integer>,
        Disable<Integer, Lesson> {
}
