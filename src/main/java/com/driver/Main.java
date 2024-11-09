package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class RWOnly
        RWOnly obj = new RWOnly();
        
        // Task 4: Try setting and getting the value of `name` directly
        // Uncommenting the following lines will cause errors
        // obj.name = "John"; // Error: name has private access in RWOnly
        // System.out.println(obj.name); // Error: name has private access in RWOnly

        // Task 6: Use the setter function to set a value and getter function to access it
        obj.setName("John");
        System.out.println("Name: " + obj.getName());
    }
}
