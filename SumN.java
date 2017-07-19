package ttt;

import java.util.Scanner;

public class SumN {
public static void main(String args[])
{
	int n=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int N=sc.nextInt();
	for(int i=0;i<=N;++i)
	{
		n+=i;
	}
	System.out.println("The sum is"+n);
	}
}
