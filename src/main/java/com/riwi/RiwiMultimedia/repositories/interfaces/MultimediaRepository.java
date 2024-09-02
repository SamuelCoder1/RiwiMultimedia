package com.riwi.RiwiMultimedia.repositories.interfaces;

import com.riwi.RiwiMultimedia.entities.Multimedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultimediaRepository extends JpaRepository<Multimedia, Integer> {
}
