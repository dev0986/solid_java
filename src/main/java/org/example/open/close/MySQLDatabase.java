package org.example.open.close;

public class MySQLDatabase implements DatabaseAbstraction {

    public void connect() {
        System.out.println("MySQL connected");
    }
}
