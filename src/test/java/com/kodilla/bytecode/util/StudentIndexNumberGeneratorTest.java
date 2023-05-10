package com.kodilla.bytecode.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentIndexNumberGeneratorTest {

    @Test
    void generateIndexNumber() {

        int stringLength = 5;
        int expectedLength = 5;
        String correctResult = StudentIndexNumberGenerator.generateIndexNumber(5);

        assertEquals(expectedLength, correctResult.length());

        int unexpectedLength = 3;
        String incorrectResult = StudentIndexNumberGenerator.generateIndexNumber(5);

        assertNotEquals(unexpectedLength, incorrectResult.length());





    }
}