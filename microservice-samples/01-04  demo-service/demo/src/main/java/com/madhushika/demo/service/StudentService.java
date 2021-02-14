package com.madhushika.demo.service;

import com.madhushika.demo.model.Student;

public interface StudentService {
    Student save(Student student);

    Student fetchStudentById(int id);
}
