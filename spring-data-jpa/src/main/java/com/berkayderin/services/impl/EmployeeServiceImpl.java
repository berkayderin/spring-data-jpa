package com.berkayderin.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.berkayderin.dto.DtoDepartment;
import com.berkayderin.dto.DtoEmployee;
import com.berkayderin.entities.Employee;
import com.berkayderin.repository.EmployeeRepository;
import com.berkayderin.services.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DtoEmployee> getAllEmployees() {
        List<DtoEmployee> dtoEmployeesList = new ArrayList<>();
        List<Employee> employees = employeeRepository.findAll();

        if (employees != null && !employees.isEmpty()) {
            for (Employee employee : employees) {
                DtoEmployee dtoEmployee = new DtoEmployee();

                BeanUtils.copyProperties(employee, dtoEmployee);

                dtoEmployee.setDepartment(
                        new DtoDepartment(employee.getDepartment().getId(), employee.getDepartment().getName()));

                dtoEmployeesList.add(dtoEmployee);
            }
        }

        return dtoEmployeesList;
    }

}
