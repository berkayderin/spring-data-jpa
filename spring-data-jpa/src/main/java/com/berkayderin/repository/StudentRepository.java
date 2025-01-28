package com.berkayderin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.berkayderin.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // buralara özel sorgular yazılabilir

    // HQL Sorgusu: sınıfın ismi ve değişken isimleri kullanılarak sorgular yazılır.
    // Alttaki hql sorgusudur.
    @Query(value = "FROM Student", nativeQuery = false)
    List<Student> findAllStudents();

    @Query(value = "from Student s WHERE s.id = :studentId", nativeQuery = false)
    Student findStudentById(Integer studentId);
}
