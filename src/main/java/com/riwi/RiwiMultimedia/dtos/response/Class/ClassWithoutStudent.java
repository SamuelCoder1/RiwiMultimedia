package com.riwi.RiwiMultimedia.dtos.response.Class;

import com.riwi.RiwiMultimedia.entities.Student;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassWithoutStudent {
    private Integer id;
    private String name;
    private String description;
}
