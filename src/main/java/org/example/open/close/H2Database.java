package org.example.open.close;

public class H2Database implements  DatabaseAbstraction{

    public void connect(){
        System.out.println("H2 connected");
    }
}
