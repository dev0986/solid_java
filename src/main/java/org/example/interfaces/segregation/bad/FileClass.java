package org.example.interfaces.segregation.bad;

public class FileClass implements BadIOInterface {
    @Override
    public void readFile() {

    }

    @Override
    public void closeFile() {

    }

    @Override
    public void connectDB() {
        //Useless here
    }

    @Override
    public void closeConnectionDB() {
        //Useless here
    }
}
