package com.oops;

public class Student {
    private String name;
    private String age;
    private int id;
    public Student( String name,String age,int id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
    public void printNameAndAge() {
        System.out.println(" Name: " + name + " Age: " + age +" Id is a "+id);
    }

    public static void main(String args[])
    {
        Student s1=new Student("Sanket","20",1);
        s1.printNameAndAge();
    }

}
