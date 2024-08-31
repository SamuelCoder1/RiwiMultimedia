package com.riwi.RiwiMultimedia.services.impl;

import com.riwi.RiwiMultimedia.dtos.response.Student.ClassWithoutStudent;
import com.riwi.RiwiMultimedia.entities.Class;
import com.riwi.RiwiMultimedia.entities.Student;
import com.riwi.RiwiMultimedia.repositories.interfaces.StudentRepository;
import com.riwi.RiwiMultimedia.services.interfaces.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class StudentImpl implements IStudentService {

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Student readById(Integer id) {
        Student student = studentRepository.findById(id).orElseThrow();

        if (student.getClasses() != null) {
            ClassWithoutStudent classDTO = new ClassWithoutStudent();
            classDTO.setId(student.getClasses().getId());
            classDTO.setName(student.getClasses().getName());
            classDTO.setDescription(student.getClasses().getDescription());
            classDTO.setDescription(student.getClasses().getDescription());
            student.setClasses(Class.builder()
                            .id(classDTO.getId())
                            .name(classDTO.getName())
                            .description(classDTO.getDescription())
                    .build());
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
