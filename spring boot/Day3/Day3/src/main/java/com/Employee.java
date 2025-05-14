package com;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;;
public class Employee {
    private int id;
    @NotBlank(message = "Name is required")
    private String name;
    @NotNull(message = "salary must not be zero")
    private double salary;
    public Employee()
    {}
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
}
