package testing_programs;

import java.util.Scanner;

public class CheckIfVowels {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter any character");
   char ch=sc.next().charAt(0);
   switch(ch)
   {
   case 'a':
	   System.out.println("a is vowel");
	   break;
   case 'e': 
	   System.out.println("e is vowel");
	   break;
   case 'i':
	   System.out.println("i is vowel");
	   break;
   case 'o':
	   System.out.println("o is vowel");
	   break;

   case 'u':
	   System.out.println("u is vowel");
	   break;
   default:
   System.out.println("not a vowel");
   break;

   }
	}

}
