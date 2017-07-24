package ttt;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=1;
		int b=sc.nextInt();
		for(int i=1;i<=b;i++)
		{
			a=a*i;
		}
System.out.println("The factorial is:"+a);
	}

}
