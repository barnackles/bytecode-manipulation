package com.kodilla.bytecode.dtos;

public class StudentRequestDto {

    private final int n;

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
