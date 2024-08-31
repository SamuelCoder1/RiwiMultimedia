package com.riwi.RiwiMultimedia.dtos.response.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {
    private String name;
    private String document;
    private String email;
    private Boolean status = true;
    private ClassWithoutStudent classes;
}
