package com.lokesh.lib;

import com.sun.imageio.plugins.common.SingleTileRenderedImage;

import javax.print.DocFlavor;

public class Person {
    private int age;
    private String name;
    private  double salary;
    Person(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Person(String name , int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
