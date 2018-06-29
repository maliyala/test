package com.meituan.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> sudordinates;
    //构造函数

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        sudordinates = new ArrayList<>();
    }
    public void add(Employee e){
        sudordinates.add(e);
    }
    public void remove(Employee e){
        sudordinates.remove(e);
    }
    public List<Employee> getSudordinates(){
        return sudordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
