package org.example.open.close;

public class MongoDBDatabase implements  DatabaseAbstraction{

    public void connect(){
        System.out.println("MongoDB connected");
    }
}
