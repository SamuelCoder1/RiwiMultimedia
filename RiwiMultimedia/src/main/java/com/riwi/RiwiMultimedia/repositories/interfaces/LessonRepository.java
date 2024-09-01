package com.riwi.RiwiMultimedia.repositories.interfaces;

import com.riwi.RiwiMultimedia.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Integer> {
    Lesson findByIdAndActiveTrue(Integer id);
}
