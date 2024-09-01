package com.riwi.RiwiMultimedia.controllers.impl;

import com.riwi.RiwiMultimedia.controllers.interfaces.IStudentController;
import com.riwi.RiwiMultimedia.entities.Student;
import com.riwi.RiwiMultimedia.services.interfaces.IStudentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@Tag(name = "Students", description = "Controlador para manejar operaciones de estudiantes")
public class StudentController implements IStudentController {

    @Autowired
    IStudentService studentService;

    @Override
    @PostMapping
    public ResponseEntity<Student> create(@RequestBody @Valid Student student) {
        Student createdStudent = studentService.create(student);
        return ResponseEntity.status(201).body(createdStudent);
    }

    @Override
    @GetMapping("/{id}")
    public Student readById(@PathVariable Integer id) {
        return studentService.readById(id);
    }

    @Override
    public ResponseEntity<List<Student>> readByPages(int page, int size) {
        // Implementación de paginación si es necesaria
        return null;
    }

    @Override
    public ResponseEntity<Student> update(Integer id, Student student) {
        // Implementación de actualización si es necesaria
        return null;
    }
}
