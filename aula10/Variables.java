package com.tomas.cursojava.aula10;

public class Variables {

    public static void main(String[] args) {

        //Java convention
        int age = 22;
        String name = "Tomas";
        String nameOfMyCat = "Luna";
        String Year2021 = "2021";

        //Accepted, but not used
        int _age;
        int $age;

        ////It's not Java convention
        String name_of_my_cat;
        String NameOfMyCat;
        String NameOfmycat;


        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("The name of my cat is " + nameOfMyCat);

        //Bad practice
        int a = 10;
        String b = "Tomas";
    }
}