package array_program;

import java.util.Scanner;

public class PrintDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {3,4,5,3,6,4};
		
		for(int i=0;i<a.length;i++)//3
		{
			for(int j=i+1;j<a.length;j++)
			{
			
				if(a[i]==a[j])
				{
					System.out.println(a[i] + "is duplicated");
					
				}
				
			}
			
			
			
		}
		//System.out.println(a[j]);
		

	}

}
