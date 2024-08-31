package com.riwi.RiwiMultimedia.services.impl;

import com.riwi.RiwiMultimedia.dtos.response.Student.ClassWithoutStudent;
import com.riwi.RiwiMultimedia.dtos.response.Student.StudentWithIdAndName;
import com.riwi.RiwiMultimedia.entities.Class;
import com.riwi.RiwiMultimedia.entities.Student;
import com.riwi.RiwiMultimedia.repositories.interfaces.StudentRepository;
import com.riwi.RiwiMultimedia.services.interfaces.IStudentService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements IStudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Student readById(Integer id) {
        Student student = studentRepository.findById(id).orElseThrow();

        if (student.getClasses() != null) {
            ClassWithoutStudent classWithoutStudent = new ClassWithoutStudent();
            classWithoutStudent.setId(student.getClasses().getId());
            classWithoutStudent.setName(student.getClasses().getName());
            classWithoutStudent.setDescription(student.getClasses().getDescription());

        }
        return student;
    }
    @Override
    public Student create(Student student) {
        return null;
    }

    @Override
    public Student update(Integer id, Student student) {
        return null;
    }

    @Override
    public Page<Student> readByPages(Pageable pageable) {
        return null;
    }


    /*@Override
    public Student create(Student studentDTO) {
        return null;
    }*/
}
