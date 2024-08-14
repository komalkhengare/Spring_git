package com.example.SpringBootCrudOperation.repository;

import com.example.SpringBootCrudOperation.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
