package com.example.demo;

public class staff {
    private String name;
    private String position;
    private String salary;
    public staff(String name, String position, String salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public staff(){

    }
    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
