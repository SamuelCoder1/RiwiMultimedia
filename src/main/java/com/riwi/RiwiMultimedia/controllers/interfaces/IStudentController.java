package com.riwi.RiwiMultimedia.controllers.interfaces;

import com.riwi.RiwiMultimedia.controllers.generic.Create;
import com.riwi.RiwiMultimedia.controllers.generic.ReadById;
import com.riwi.RiwiMultimedia.controllers.generic.ReadByPages;
import com.riwi.RiwiMultimedia.controllers.generic.Update;
import com.riwi.RiwiMultimedia.dtos.response.Student.StudentDTO;
import com.riwi.RiwiMultimedia.dtos.response.Student.StudentWithIdAndName;
import com.riwi.RiwiMultimedia.entities.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IStudentController extends
        ReadById<Student, Integer>
        ,Create<StudentDTO, Student>
        ,Update<Integer, Student> {

    ResponseEntity<List<Student>> readByPages(int page, int size);
}
