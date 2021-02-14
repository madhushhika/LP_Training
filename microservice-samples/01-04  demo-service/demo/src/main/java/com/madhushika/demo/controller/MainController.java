package com.madhushika.demo.controller;

import com.madhushika.demo.model.Student;
import com.madhushika.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/hello")
    public String greeting() {
        return "Hello world !";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String greetingPost() {
        return "Hello world I am from Post!";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student saveStudent(@RequestBody Student student) {
        return studentService.save(student);
    }
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id){

        Student student= studentService.fetchStudentById(id);
        if(student==null){
            return   ResponseEntity.notFound().build();
        }else{
            return  ResponseEntity.ok().body(student);
        }
    }


}
