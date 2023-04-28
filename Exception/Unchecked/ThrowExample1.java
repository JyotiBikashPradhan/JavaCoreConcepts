//Example of try-catch block with throw keyword to handle the square root of negative number
package com.company.Learnjava.Exception.Unchecked;
import java.util.Scanner;

public class ThrowExample1 {
//    throw keyword is used to manually throw an exception from a method or a block of code
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to find square root:" );
    double a= sc.nextDouble();
    try{
        if(a<0){
            throw new IllegalArgumentException ("Square root of negative number is undefined");
        }
        double squareRoot=Math.sqrt(a);
        System.out.println("The square root of "+a+"is :" +squareRoot);
    } catch (IllegalArgumentException e) {
        System.out.println("error "+ e.getMessage());;
    }


}

}
