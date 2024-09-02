package com.riwi.RiwiMultimedia.controllers.impl;

import com.riwi.RiwiMultimedia.controllers.interfaces.IStudentController;
<<<<<<< HEAD
=======



import com.riwi.RiwiMultimedia.dtos.response.Student.StudentDTO;
import com.riwi.RiwiMultimedia.dtos.response.Student.StudentWithIdAndName;
import com.riwi.RiwiMultimedia.entities.Class;
import com.riwi.RiwiMultimedia.entities.Student;
import com.riwi.RiwiMultimedia.repositories.interfaces.ClassesRepository;
import com.riwi.RiwiMultimedia.services.interfaces.IStudentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.riwi.RiwiMultimedia.dtos.response.Student.StudentWithIdAndName;
>>>>>>> 5b1ee6c456ca4d621d2d2e9ca96c434c8476dde0
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

<<<<<<< HEAD
    @Override
    @PostMapping
    public ResponseEntity<Student> create(@RequestBody @Valid Student student) {
        Student createdStudent = studentService.create(student);
        return ResponseEntity.status(201).body(createdStudent);
=======
    @Autowired
    ClassesRepository classesRepository;

    @Override
    @PostMapping("/create")
    public ResponseEntity<Student> create(@Valid @RequestBody StudentDTO studentDTO) {
        Optional<Class> classOptional = classesRepository.findById(studentDTO.getClasses().getId());
        if (!classOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Student student = new Student();

        student.setName(studentDTO.getName());
        student.setDocument(studentDTO.getDocument());
        student.setEmail(studentDTO.getEmail());
        student.setStatus(studentDTO.getStatus());
        student.setClasses(classOptional.get());
        student.setCreateAt(LocalDateTime.now());

        Student createdStudent = studentService.create(student);

        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);

>>>>>>> 5b1ee6c456ca4d621d2d2e9ca96c434c8476dde0
    }

    @Override
    @GetMapping("/{id}")
    public Student readById(@PathVariable Integer id) {
        return studentService.readById(id);
    }

    @Override
<<<<<<< HEAD
    public ResponseEntity<List<Student>> readByPages(int page, int size) {
        // Implementación de paginación si es necesaria
        return null;
=======

    @GetMapping("/readByPages")
    public ResponseEntity<List<Student>> readByPages(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "2") int size) {
        Student student = new Student();
        Pageable pageable = PageRequest.of(page, size);
        Page<Student> studentsPage = studentService.readByPages(pageable);

        List<Student> studentsList = studentsPage.getContent();

        return ResponseEntity.ok(studentsList);

>>>>>>> 5b1ee6c456ca4d621d2d2e9ca96c434c8476dde0
    }

    @Override
    public ResponseEntity<Student> update(Integer id, Student student) {
        // Implementación de actualización si es necesaria
        return null;
    }
}
