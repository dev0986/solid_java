package org.example.open.close;

public class DetermineDatabaseConnection {

    public static void determineDB(DatabaseAbstraction databaseAbstraction) {
//        if (dbName.equals("Mongo")) {
//            System.out.println(dbName);
//        } else if (dbName.equals("H2")) {
//            System.out.println(dbName);
//        } else if (dbName.equals("MySQL")) {
//            System.out.println(dbName);
//        }
//        //For every new DB source added to project, come here and
        //Interfaces, new DB added, just add a class and extend the interface and
        //provide implementation for connect method();
         databaseAbstraction.connect();
    }
}
