package com.berkayderin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU { // InsertUpdate
    private String firstName;

    private String lastName;

    private String birthDate;
}
