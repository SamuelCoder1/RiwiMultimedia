package com.riwi.RiwiMultimedia.dtos.response.Student;

import com.riwi.RiwiMultimedia.entities.Student;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassWithoutStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_class")
    private Integer id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 225, nullable = false)
    private String description;

}
