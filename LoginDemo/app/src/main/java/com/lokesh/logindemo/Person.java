package com.lokesh.logindemo;

public class Person {
    private String name;
    private int age;
    private int salary;

    Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    Person(String name, int age, int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }


//    Person(){}
//
//    Person(String name, int age, int salary, int height){
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
//        this.height = height;
//        this.weight = weight;
//
//    }

}
