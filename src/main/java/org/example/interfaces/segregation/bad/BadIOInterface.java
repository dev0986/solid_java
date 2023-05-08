package org.example.interfaces.segregation.bad;

//Fat interface - has methods pertaining to DB and File system.
//Any class implementing this would have to
//provide implementation for DB and File System.
public interface BadIOInterface {

    public void readFile();
    public void closeFile();

    public void connectDB();

    public void closeConnectionDB();
}
