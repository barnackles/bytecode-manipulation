package com.kodilla.bytecode.controller;

import com.kodilla.bytecode.dtos.StudentRequestDto;
import com.kodilla.bytecode.util.StudentGenerator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/student")
public class StudentCreationController {


    @PostMapping("/create")
    public ResponseEntity<HashMap<Integer, String>> createStudents(@RequestBody StudentRequestDto studentRequestDto) {

        HashMap<Integer, String> students = StudentGenerator.generateMapOfStudents(studentRequestDto.getN(),
                studentRequestDto.getZ());

        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }


}
