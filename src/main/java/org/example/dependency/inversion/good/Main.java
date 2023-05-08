package org.example.dependency.inversion.good;

public class Main {

    //Calculate class is not dependent on Add or Subtract.
    //Using an interface, dynamic binding will happeen.
    public static void main(String[] args) {
        System.out.println(Calculator.calculate(new AddOperation(), 10, 23));
        System.out.println(Calculator.calculate(new SubtractOperation(), 10, 23));
    }
}
