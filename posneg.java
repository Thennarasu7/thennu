package ttt;

import java.util.Scanner;

public class posneg
{
public static void main(String[] args)
  {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the number");
	int num=sc.nextInt();
	if(num>0)
		System.out.println("The number is positive");
	if(num<0)
		System.out.println("The number is negative");
	if(num==0)
		System.out.println("The number is zero");

  }

}
