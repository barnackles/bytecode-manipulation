package com.kodilla.bytecode.controller;

import com.kodilla.bytecode.dtos.StudentRequestDto;
import com.kodilla.bytecode.util.StudentGenerator;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentCreationController {


    @PostMapping("/create")
    public ResponseEntity<HashMap<Integer, String>> createStudents(@Valid @RequestBody StudentRequestDto studentRequestDto) {

        HashMap<Integer, String> students = StudentGenerator.generateMapOfStudents(studentRequestDto.getN(),
                studentRequestDto.getZ());

        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseEntity<Map<String, String>> handleMethodArgumentNotValidExceptions(MethodArgumentNotValidException exc) {
        Map<String, String> errorsMap = new HashMap<>();
        List<ObjectError> errorsList = exc.getBindingResult().getAllErrors();
        errorsList.forEach((errorObject) -> {
            FieldError fieldError = (FieldError) errorObject;
            String name = fieldError.getField();
            String message = errorObject.getDefaultMessage();
            errorsMap.put(name, message);
        });
        return new ResponseEntity<>(errorsMap, HttpStatus.BAD_REQUEST);
    }


}
