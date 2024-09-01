package com.riwi.RiwiMultimedia.dtos.response.Student;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentWithIdAndName {
    @NotNull(message = "El id es requerido")
    private Integer id;
    @NotBlank(message = "El nombre es requerido")
    private String name;
}
