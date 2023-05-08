package org.example.open.close;

//Open for Extension, closed for Modification.
//Program to interface.
public class Main {

    public static void main(String[] args) {


        DetermineDatabaseConnection.determineDB(new MySQLDatabase());

    }
}
