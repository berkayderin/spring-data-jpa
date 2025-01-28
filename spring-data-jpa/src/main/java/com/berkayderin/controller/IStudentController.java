package com.berkayderin.controller;

import java.util.List;

import com.berkayderin.dto.DtoStudent;
import com.berkayderin.dto.DtoStudentIU;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudentById(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
