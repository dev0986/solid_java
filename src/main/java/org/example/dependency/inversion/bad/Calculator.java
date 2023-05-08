package org.example.dependency.inversion.bad;

//Important: Calculator has dep. on AddOperation and SubOperation here.

public class Calculator {

    public int calculate(int a, int b, String operation) {
        int result = 0;
        switch (operation) {
            case "add":
                System.out.println("Add");

                //Hard coding dependency here.
                //Higher module - calculate depending on AddOperation
                AddOperation addOperation = new AddOperation();
                result  = addOperation.add(a,b);
                break;
            case "sub":
                System.out.println("Subtract");
                //Hard coding dependency here.
                //Higher module - calculate depending on SubOperation
                SubOperation subOperation = new SubOperation();
                result = subOperation.subtract(a,b);
                break;
        }
        return result;
    }
}
