//Example of divide by zero exception using finally block

package com.company.Learnjava.Exception.Unchecked;
import java.util.Scanner;

public class DivideByZero
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two number for division:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int d=a/b;
            System.out.println(d);
        } catch (ArithmeticException ae){
            System.out.println("error" +ae.getMessage());
        }
//        finally is used to execute a block of code whether an exception is thrown or not
        finally {
            if(b==0){
                System.out.println("value not found");
            }
            else{
                System.out.println("exception handled successfully");
            }
        }
    }
}
