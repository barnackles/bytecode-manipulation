package com.kodilla.bytecode.util;

import java.util.Random;

public class StudentIndexNumberGenerator {

    public static String generateIndexNumber(int z) {
        int leftLimit = 97; // 'a'
        int rightLimit = 122; // 'z'
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .limit(z)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
