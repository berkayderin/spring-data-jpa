package com.berkayderin.services;

import java.util.List;

import com.berkayderin.entities.Student;

public interface IStudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);

    public void deleteStudentById(Integer id);

    public Student updateStudent(Integer id, Student updateStudent);
}
