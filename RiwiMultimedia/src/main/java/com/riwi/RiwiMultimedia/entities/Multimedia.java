package com.riwi.RiwiMultimedia.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "multimedia")
public class Multimedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_multimedia")
    private Integer id;

    @Column(length = 100)
    private String video;

    @Column(length = 100)
    private String audio;

    @Column(length = 100)
    private String document;

    @ManyToOne
    @JoinColumn(name = "id_lesson")
    private Lesson lesson;

    @Column(nullable = false)
    private Boolean active = true;
}
