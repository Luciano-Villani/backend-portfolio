package com.backend.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;

    @NotEmpty(message = "Ingrese un nombre válido.")
    private String name;

    @NotEmpty(message = "Ingrese un email válido.")
    @Email
    private String email;

    @NotEmpty(message = "Ingrese un password válido.")
    private String password;
}
