package com.berkayderin.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berkayderin.controller.IStudentController;
import com.berkayderin.entities.Student;
import com.berkayderin.services.IStudentService;

@RestController
@RequestMapping("/api")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentServices;

    @PostMapping("/student")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentServices.saveStudent(student);
    }

}
