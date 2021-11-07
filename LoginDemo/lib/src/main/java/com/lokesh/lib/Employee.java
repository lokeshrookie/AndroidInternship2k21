package com.lokesh.lib;

public class Employee extends  Person {
    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{}";
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge() ;
    }



    @Override
    public double getSalary() {
        return super.getSalary() + 100000;
    }
}
