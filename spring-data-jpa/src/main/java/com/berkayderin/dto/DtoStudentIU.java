package com.berkayderin.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU { // InsertUpdate

    @NotEmpty(message = "Firstname alanı boş olamaz")
    @Min(value = 3, message = "Firstname alanı en az 3 karakter olmalıdır")
    @Max(value = 50, message = "Firstname alanı en fazla 50 karakter olmalıdır")
    private String firstName;

    @Size(min = 3, max = 50) // size ile min ve max aynı anda kullanılabilir.
    private String lastName;

    private String birthDate;

    // @Email(message = "Geçerli bir email adresi giriniz")
    // private String email;

    // @Size(min = 11, max = 11, message = "TCKN 11 haneli olmalıdır")
    // @NotEmpty(message = "TCKN alanı boş olamaz")
    // private String tckn;
}
