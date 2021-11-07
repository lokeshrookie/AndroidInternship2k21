package com.lokesh.logindemo;

public class MyClass {
    public static void main(String[] args) {
        Person lokesh   = new Person("lokesh",22,120000);
        System.out.println(lokesh.getAge());
        System.out.println(lokesh.getName());
        System.out.println(lokesh.getSalary());
    }
}
