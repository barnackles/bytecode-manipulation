package com.kodilla.bytecode.reflection;

import com.kodilla.bytecode.util.StudentIndexNumberGenerator;

public class Student {


    private final String indexNumber;

    public Student(int z) {
        indexNumber = StudentIndexNumberGenerator.generateIndexNumber(z);
    }

    public String getIndexNumber() {
        return indexNumber;
    }



}
