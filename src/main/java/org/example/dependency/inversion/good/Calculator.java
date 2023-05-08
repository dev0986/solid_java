package org.example.dependency.inversion.good;

public class Calculator {

    public static int calculate(CalculateOperation calculateOperation, int a , int b){
        return calculateOperation.operate(a, b);
    }
}
