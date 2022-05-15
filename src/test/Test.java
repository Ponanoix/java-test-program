package test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    static Logger writer = Logger.getLogger(Test.class.getName());
    public static void main(String[] args) {
        writer.log(Level.SEVERE, "Hello, world!");
    }
}