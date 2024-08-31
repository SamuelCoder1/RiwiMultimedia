package com.riwi.RiwiMultimedia.dtos.response.Student;

import com.riwi.RiwiMultimedia.dtos.response.Class.ClassWithoutStudent;
import jakarta.validation.constraints.Email;
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
public class StudentDTO {
    @NotBlank(message = "El nombre es requerido")
    private String name;

    @NotBlank(message = "El documento es requerido")
    private String document;

    @NotBlank(message = "El email es requerido")
    @Email(message = "El email debe ser válido")
    private String email;

    private Boolean status = true;

    @NotNull(message = "La clase es requerida")
    private String name;
    private String document;
    private String email;
    private Boolean status = true;
    private ClassWithoutStudent classes;
}
