package com.riwi.RiwiMultimedia.services.interfaces;

import com.riwi.RiwiMultimedia.dtos.response.Student.StudentWithIdAndName;
import com.riwi.RiwiMultimedia.entities.Student;
import com.riwi.RiwiMultimedia.services.CRUD.Create;
import com.riwi.RiwiMultimedia.services.CRUD.ReadById;
import com.riwi.RiwiMultimedia.services.CRUD.ReadByPages;
import com.riwi.RiwiMultimedia.services.CRUD.Update;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IStudentService extends
        ReadById<Student, Integer>
        , Create<Student>
        , Update<Integer, Student> {

    Page<Student> readByPages(Pageable pageable);
}
