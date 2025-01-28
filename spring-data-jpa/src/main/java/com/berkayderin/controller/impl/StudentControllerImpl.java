package com.berkayderin.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.berkayderin.controller.IStudentController;
import com.berkayderin.dto.DtoStudent;
import com.berkayderin.dto.DtoStudentIU;
import com.berkayderin.services.IStudentService;

@RestController
@RequestMapping("/api")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentServices;

    @PostMapping("/students")
    @Override
    public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {
        return studentServices.saveStudent(dtoStudentIU);
    }

    @GetMapping("/students")
    @Override
    public List<DtoStudent> getAllStudents() {
        return studentServices.getAllStudents();
    }

    @GetMapping("/students/{id}")
    @Override
    public DtoStudent getStudentById(@PathVariable(name = "id") Integer id) {
        return studentServices.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    @Override
    public void deleteStudentById(@PathVariable(name = "id") Integer id) {
        studentServices.deleteStudentById(id);
    }

    @PutMapping("/students/{id}")
    @Override
    public DtoStudent updateStudent(@PathVariable(name = "id") Integer id, @RequestBody DtoStudentIU dtoStudentIU) {
        return studentServices.updateStudent(id, dtoStudentIU);
    }

}
