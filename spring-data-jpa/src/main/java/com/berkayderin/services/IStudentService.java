package com.berkayderin.services;

import java.util.List;

import com.berkayderin.dto.DtoStudent;
import com.berkayderin.dto.DtoStudentIU;

public interface IStudentService {

    public DtoStudent saveStudent(DtoStudentIU student);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudentById(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
