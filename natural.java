package ttt;

import java.util.Scanner;

public class natural {

	public static void main(String[] args)
	{
		int num=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	for(int i=0;i<=number;i++)
	{
		num+=i;
	}
	System.out.println("The sum of natural number is"+num);
	}
	

}
