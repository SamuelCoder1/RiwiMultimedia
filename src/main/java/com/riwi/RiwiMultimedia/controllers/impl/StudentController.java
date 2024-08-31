package com.riwi.RiwiMultimedia.controllers.impl;

import com.riwi.RiwiMultimedia.controllers.interfaces.IStudentController;

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
import com.riwi.RiwiMultimedia.entities.Student;
import com.riwi.RiwiMultimedia.services.interfaces.IStudentService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("students")
@Tag(name = "Students", description = "Este es el controlador de los Estudiantes")
public class StudentController implements IStudentController {

    @Autowired
    IStudentService studentService;

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
    @Override
    public ResponseEntity<Student> create() {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public Student readById(@PathVariable Integer id) {
        return studentService.readById(id);
    }

    @Override
    @GetMapping("/readByPages")
    public ResponseEntity<List<Student>> readByPages(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "2") int size) {

        Pageable pageable = PageRequest.of(page, size);
        Page<Student> eventosPage = studentService.readByPages(pageable);

        List<Student> studentsList = eventosPage.getContent();

        return ResponseEntity.ok(studentsList);
    public ResponseEntity<List<Student>> readByPages(int page, int size) {
        return null;
    }

    @Override
    public ResponseEntity<Student> update(Integer integer, Student student) {
        return null;
    }
}
