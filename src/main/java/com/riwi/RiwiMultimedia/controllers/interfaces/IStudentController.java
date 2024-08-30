package com.riwi.RiwiMultimedia.controllers.interfaces;

import com.riwi.RiwiMultimedia.controllers.generic.Create;
import com.riwi.RiwiMultimedia.controllers.generic.ReadById;
import com.riwi.RiwiMultimedia.entities.Student;

public interface IStudentController extends
        ReadById<Student, Long>
        ,Create<Student> {
}
