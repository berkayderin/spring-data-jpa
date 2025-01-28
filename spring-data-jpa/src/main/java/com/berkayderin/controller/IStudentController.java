package com.berkayderin.controller;

import java.util.List;

import com.berkayderin.entities.Student;

public interface IStudentController {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);
}
