package com.madhushika.demo.repository;

import com.madhushika.demo.model.Student;
import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface StudentRepository extends Repository<Student,Integer> {

    Student save(Student student);

    Optional<Student> findById(int id);
}
