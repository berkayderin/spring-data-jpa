package com.berkayderin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.berkayderin.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // buralara özel sorgular yazılabilir
}
