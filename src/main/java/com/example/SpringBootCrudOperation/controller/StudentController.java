package com.example.SpringBootCrudOperation.controller;

import com.example.SpringBootCrudOperation.entities.Student;
import com.example.SpringBootCrudOperation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.
        bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository repository;
    //Get all students ->endpoint
    @GetMapping("/students")
    public List<Student>getAllstudents(){
        List<Student>students=repository.findAll();
        return students;
    }
    //Get students by id
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        Student student=repository.findById(id).get();
        return student;
    }
    //Create new student/add student record
    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        repository.save(student);
    }
    //update student by id
    @PutMapping("/students/update/{id}")
    public Student updateStudent(@PathVariable int id){
        Student student=repository.findById(id).get();
        student.setName("Piuu");
        student.setPercentage(95.40);
        repository.save(student);
        return student;
    }
    @DeleteMapping("/students/delete/{id}")
    public void  deleteStudent(@PathVariable int id){
        Student student=repository.findById(id).get();
        repository.deleteById(id);

    }
}
