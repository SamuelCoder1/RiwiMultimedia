package com.riwi.RiwiMultimedia.controllers.impl;

import com.riwi.RiwiMultimedia.controllers.interfaces.IStudentController;
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
    public ResponseEntity<List<Student>> readByPages(int page, int size) {
        return null;
    }

    @Override
    public ResponseEntity<Student> update(Integer integer, Student student) {
        return null;
    }
}
