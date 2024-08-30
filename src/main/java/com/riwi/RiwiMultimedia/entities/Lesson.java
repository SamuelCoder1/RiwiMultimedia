package com.riwi.RiwiMultimedia.entities;

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
@Entity(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lesson")
    private Integer id;

    @Column(length = 100, nullable = false)
    private String title;

    @OneToMany
    @JoinColumn(name = "id_lesson")
    private List<Multimedia> multimedia;

    @ManyToOne
    @JoinColumn(name = "id_class")
    private Class classes;
}
