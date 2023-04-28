//Example of multiiple catch block to handle ArithmeticException & ArrayIndexOutOfBoundsException

package com.company.Learnjava.Exception.Unchecked;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int size =sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter the elements of an array:");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        try{
            System.out.println("enter an index");
            int index=sc.nextInt();
            int value=arr[index] /index;
            System.out.println("result is:"+ value);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("error"+e.getMessage());
        } finally{
            System.out.println("program completed");
        }
    }
}
