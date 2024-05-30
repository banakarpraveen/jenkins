package com.core.jenkins.controler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class StudentController {

    @GetMapping
    public ResponseEntity<Student> getStudent()
    {
return new ResponseEntity<>(new Student("prveen","1001"), HttpStatus.OK);
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student
{
    String name;
    String id;
}
