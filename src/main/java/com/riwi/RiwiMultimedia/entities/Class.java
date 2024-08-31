package com.riwi.RiwiMultimedia.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.riwi.RiwiMultimedia.dtos.response.Student.StudentWithIdAndName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "classes")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_class")
    private Integer id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 225, nullable = false)
    private String description;

    @OneToMany(mappedBy = "classes", fetch = FetchType.LAZY)
    private List<Student> student;

}
