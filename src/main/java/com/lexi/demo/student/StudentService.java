package com.lexi.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Ian Lombu",
                        "ian@gmail.com",
                        LocalDate.of(2021, Month.FEBRUARY, 21),
                        21
                )
        );
    }
}
