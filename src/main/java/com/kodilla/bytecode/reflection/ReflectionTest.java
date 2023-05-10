package com.kodilla.bytecode.reflection;

import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) {
        Class<Book> descriptor = Book.class;
        for (Method method : descriptor.getMethods()) {
            System.out.println(method.getName());
        }
    }
}
