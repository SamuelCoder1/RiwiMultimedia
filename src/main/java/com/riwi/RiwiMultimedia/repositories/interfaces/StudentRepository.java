package com.riwi.RiwiMultimedia.repositories.interfaces;

import com.riwi.RiwiMultimedia.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
