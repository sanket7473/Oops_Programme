package com.oops;

public class Dog {
    String breed;
    int age;
    double weight;
    public Dog(String breed,int age,double weight)
    {
        this. breed=breed;
        this.age=age;
        this.weight=weight;

    }
    public void CalculateDogage()
    {
      double dogAgeinHumanEyeAge=15*age;
        System.out.println("Dog age in human eyes is "+dogAgeinHumanEyeAge);
    }
    public void dogDescription()
    {
        System.out.println("Dog real age is:"+age+" Dog breed is: "+breed
        +" Dog weight is:" +weight);
    }
    public static void main(String args[])
    {
        Dog d1=new Dog("Golden Retriever",5,20.45);
        d1.CalculateDogage();
        d1.dogDescription();

    }
}
