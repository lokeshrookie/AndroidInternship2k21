package com.lokesh.lib;

public class MyClass {
    public static void main(String[] args) {
//        Person lokesh = new Person();
//        lokesh.setName("Lokesh");
//        System.out.println(lokesh.getName());
//        lokesh.setAge(22);
//        System.out.println(lokesh.getAge());
//
        Person p = new Person();
        p.setSalary(50000);
        System.out.println(p.getSalary());
        Employee em = new Employee();
        System.out.println(em.getSalary());
    }

}
