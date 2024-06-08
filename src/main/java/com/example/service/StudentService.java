package com.example.service;

import com.example.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student getStudent(Long id);
    List<Student> getStudents();
    void deleteStudent(Long id);
    Student saveStudent(Student student);
}
