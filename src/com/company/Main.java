package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = "Tri";
        int population=4567897;
        float interstRate=12.5F;
        long numberOfBytes=2000L;
        double price=15.55;
        char letter='A';
        boolean valid =false;

        double distance= 3065e+9;
        // declare variables here before we use them.
        int x,y,answer;
        //all three variables will declare as integers
        double temperature;
        float Temperature;
        // a float uses less memory than a double
        String firstName,lastName;

        //assigning variable here
        x=99;
        y=2456;
        answer =x+y;
        firstName="James";
        lastName="Martin";
        temperature=100;
        Temperature=10;
        System.out.println("First variable " + x);
        System.out.println("Second variable"+y);
        System.out.println("Answer:" +answer);
        System.out.println("If you are sick your temperature may be  " +temperature);
        System.out.println("if temperature is:"+Temperature +"   too cold");
        System.out.println("the Auther is"+firstName+" "+lastName);

//        System.out.println("Hello World");
        System.out.println("Today is  16th January 2019");
        System.out.println("My name is TRI." + name);
        System.out.println(name);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter employee number:");
        String employeeNum;
        employeeNum = keyboard.nextLine();
        System.out.println(employeeNum);


}}

