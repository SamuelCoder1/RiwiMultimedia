package com.riwi.RiwiMultimedia.controllers.impl;

import com.riwi.RiwiMultimedia.controllers.interfaces.ILessonController;
import com.riwi.RiwiMultimedia.entities.Lesson;
import com.riwi.RiwiMultimedia.services.interfaces.ILessonService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/lessons")
@Tag(name = "Lessons", description = "Controlador para manejar operaciones de lecciones")
public class LessonController implements ILessonController {

    @Autowired
    ILessonService lessonService;

    @Override
    @PostMapping
    public ResponseEntity<Lesson> create(@RequestBody @Valid Lesson lesson) {
        Lesson createdLesson = lessonService.create(lesson);
        return ResponseEntity.status(201).body(createdLesson);
    }

    @Override
    @GetMapping("/{id}")
    public Lesson readById(@PathVariable Integer id) {
        return lessonService.readById(id);
    }

    @Override
    @PatchMapping("/{id}/disable")
    public ResponseEntity<Lesson> disable(@PathVariable Integer id) {
        Lesson disabledLesson = lessonService.disable(id);
        return ResponseEntity.ok(disabledLesson);
    }

    @Override
    @GetMapping("/{id}/multimedia")
    public ResponseEntity<Lesson> getLessonWithMultimedia(@PathVariable Integer id) {
        Lesson lesson = lessonService.readById(id);
        return ResponseEntity.ok(lesson);
    }
}
