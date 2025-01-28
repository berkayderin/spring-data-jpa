package com.berkayderin.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berkayderin.entities.Student;
import com.berkayderin.repository.StudentRepository;
import com.berkayderin.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        // öğrenci bulunamazsa null dönecek
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteStudentById(Integer id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
        } else {
            throw new RuntimeException("Öğrenci bulunamadı");
        }
    }

    @Override
    public Student updateStudent(Integer id, Student updateStudent) {
        Student dbStudent = getStudentById(id);

        if (dbStudent == null) {
            throw new RuntimeException("Öğrenci bulunamadı");
        }

        dbStudent.setFirstName(updateStudent.getFirstName());
        dbStudent.setLastName(updateStudent.getLastName());
        dbStudent.setBirthDate(updateStudent.getBirthDate());

        return studentRepository.save(dbStudent);

    }
}
