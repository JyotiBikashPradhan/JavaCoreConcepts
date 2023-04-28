package com.company.Learnjava.Exception.Unchecked;
import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try{
            try{
                String s=null;
                System.out.println(s.length());
            }catch (NullPointerException ne) {
                System.out.println("error "+ne.getMessage());
            }
            try{
                int[] a=new int[5];
                a[5]=10;
            }catch (ArrayIndexOutOfBoundsException ae){
                System.out.println("error "+ae.getMessage());
            }
            System.out.print("Enter a number: ");
            String input = sc.nextLine();
//try to convert the input to int using the parseInt() method .If the input is not a valid integer, it will throw a NumberFormatException
            try {
                int number = Integer.parseInt(input);
                System.out.println("The number is: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
            try{
                System.out.println("enter two number for division:");
                int a=sc.nextInt();
                int b=sc.nextInt();
                int d=a/b;
                System.out.println(d);
            }catch (ArithmeticException ae) {
                System.out.println("error " + ae.getMessage());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
