package com.company.Learnjava.Exception.Unchecked;

import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        int age=sc.nextInt();
        try{
            checkEligibility(age);
            System.out.println("congratulation! you are eligible fr scholarship");
        }catch(IllegalArgumentException e){
            System.out.println("error "+e.getMessage());
        }


    }
    private static void checkEligibility(int age) throws IllegalArgumentException  {
        if(age<18 || age>30){
            throw new IllegalArgumentException("sorry you cant get it now");
        }

    }


}
