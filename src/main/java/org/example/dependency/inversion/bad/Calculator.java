package org.example.dependency.inversion.bad;

//Important: Calculator has dep. on AddOperation and SubOperation here.

public class Calculator {

    public int calculate(int a, int b, String operation) {
        int result = 0;
        switch (operation) {
            case "add":
                System.out.println("Add");
                AddOperation addOperation = new AddOperation();
                result  = addOperation.add(a,b);
                break;
            case "sub":
                System.out.println("Subtract");
                SubOperation subOperation = new SubOperation();
                result = subOperation.subtract(a,b);
                break;
        }
        return result;
    }
}
