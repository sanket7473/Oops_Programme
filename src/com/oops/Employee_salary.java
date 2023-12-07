package com.oops;

public class Employee_salary {
    private String name;
    private int Monthsalary;
    private int id;
    public Employee_salary(String name,
    int salary,
    int id)
    {
        this.name =name;
        this.Monthsalary=salary;
        this.id=id;

    }
    public void calculateSalary()
    {
       int totalSalary= Monthsalary*12;
        System.out.println("Employee yearly salary is "+ totalSalary+" Name of employee is"+name);
    }
    public static void main(String args[])
    {
        Employee_salary e1=new Employee_salary("sanket",20000,1);
        e1.calculateSalary();

    }

}
