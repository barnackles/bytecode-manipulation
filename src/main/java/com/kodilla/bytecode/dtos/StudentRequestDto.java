package com.kodilla.bytecode.dtos;

import com.kodilla.bytecode.validators.IntRange;


public class StudentRequestDto {

    @IntRange(min = 10, max = 20)
    private final int n;

    @IntRange(min = 1, max = 10)
    private final int z;

    public StudentRequestDto(int n, int z) {
        this.n = n;
        this.z = z;
    }

    public int getN() {
        return n;
    }

    public int getZ() {
        return z;
    }
}
