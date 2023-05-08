package org.example.interfaces.segregation.good;

//only implementing interface where it can provide concrete implementations
//for all methods.
public class FileIO implements  FileDaoInterface{
    @Override
    public void read() {

    }

    @Override
    public void closeReader() {

    }
}
