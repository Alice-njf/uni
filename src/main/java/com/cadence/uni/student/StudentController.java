package com.cadence.uni.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path="uni/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
                new Student(
                        1L,
                        "Alice Ara",
                        "Alice@gmail.com",
                        Gender.FEMALE),
                new Student(
                        2L,
                        "Willi sha",
                        "willi@gmail.com",
                        Gender.MALE)
        );
        return students;
    }
}

