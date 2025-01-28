package com.berkayderin.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berkayderin.dto.DtoStudent;
import com.berkayderin.dto.DtoStudentIU;
import com.berkayderin.entities.Student;
import com.berkayderin.repository.StudentRepository;
import com.berkayderin.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);

        student = studentRepository.save(student);
        BeanUtils.copyProperties(student, response);

        return response;
    }

    @Override
    public List<DtoStudent> getAllStudents() {
        List<DtoStudent> response = new ArrayList<>();
        List<Student> students = studentRepository.findAllStudents();

        for (Student student : students) {
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(student, dtoStudent);
            response.add(dtoStudent);
        }

        return response;
    }

    @Override
    public DtoStudent getStudentById(Integer id) {
        DtoStudent response = new DtoStudent();
        Student student = studentRepository.findStudentById(id);

        if (student != null) {
            BeanUtils.copyProperties(student, response);
        }

        return response;
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
    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
        DtoStudent response = new DtoStudent();
        Optional<Student> studentOptional = studentRepository.findById(id);

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            BeanUtils.copyProperties(dtoStudentIU, student);

            student = studentRepository.save(student);
            BeanUtils.copyProperties(student, response);
        } else {
            throw new RuntimeException("Öğrenci bulunamadı");
        }

        return response;
    }
}
