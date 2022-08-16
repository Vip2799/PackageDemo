package com.example;

public class Student {
    static int rollNo;
    String name;
    String address;

    public Student(String name, String address) {
        rollNo++;
        this.name = name;

        this.address = address;
    }

    public void display() {
        System.out.println("Name of the Student = " + name);
        System.out.println("Roll number         = " + rollNo);
        System.out.println("Address             = " + address);

    }
}
