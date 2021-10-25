package com.example.demo.services;

import com.example.demo.modals.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1,
                        "Ada Meceffeuk",
                        "averroes96@gmail.com",
                        21,
                        LocalDate.of(1996, Month.JULY, 4)
                )
        );
    }
}
