package testing_programs;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value a=");
    int a= sc.nextInt();
    System.out.println("enter value b=");
    int b= sc.nextInt();

     int temp=a;
       a=b;
       b=temp;
     System.out.println("value of a after swapping:"+a);
     System.out.println("value of b after swapping:"+b);

	}

}