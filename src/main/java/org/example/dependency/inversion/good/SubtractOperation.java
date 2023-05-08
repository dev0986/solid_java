package org.example.dependency.inversion.good;

public class SubtractOperation implements CalculateOperation {
    @Override
    public int operate(int a, int b) {
        return a - b;
    }
}
