package com.kodilla.bytecode.util;

import com.kodilla.bytecode.reflection.Student;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentGenerator {

    public static HashMap<Integer, String> generateMapOfStudents(int n, int z) {

        List<Student> listOfStudents = new ArrayList<>();
        HashMap<Integer,String> mapOfStudents = new HashMap<>();

        for (int i = 0; i < n; i++) {
            listOfStudents.add(new Student(z));
        }


        for (Student s : listOfStudents) {

            Field signatureField = null;
            try {
                signatureField = Student.class.getDeclaredField("indexNumber");
                signatureField.setAccessible(true);
                String value = (String) signatureField.get(s);

                mapOfStudents.put(s.hashCode(), value);

                System.out.println(value);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }

        }

        return mapOfStudents;
    }
}
