package com.riwi.RiwiMultimedia.services.impl;

import com.riwi.RiwiMultimedia.entities.Lesson;
import com.riwi.RiwiMultimedia.repositories.interfaces.LessonRepository;
import com.riwi.RiwiMultimedia.services.interfaces.ILessonService;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LessonImpl implements ILessonService {

    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public Lesson create(Lesson lesson) {
        Lesson createdLesson = lessonRepository.save(lesson);
        return ResponseEntity.status(201).body(createdLesson).getBody();
    }

    @Override
    public Lesson readById(Integer id) {
        return lessonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Lesson not found with id " + id));
    }


    @Override
    public Lesson disable(Integer id) {
        Lesson lesson = lessonRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Lesson not found with id " + id));
        lesson.setActive(false);
        lesson.getMultimedia().forEach(multimedia -> multimedia.setActive(false));
        lessonRepository.save(lesson);
        return ResponseEntity.ok(lesson).getBody();
    }
}
