package org.example.interfaces.segregation.bad;

public class DBClass implements  BadIOInterface{
    @Override
    public void readFile() {
        //Useless to this class
    }

    @Override
    public void closeFile() {
        //Useless to this class
    }

    @Override
    public void connectDB() {

    }

    @Override
    public void closeConnectionDB() {

    }
}
