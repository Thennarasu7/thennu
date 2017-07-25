package ttt;

import java.util.Scanner;

public class renint
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		int c;
		for(int i=0;i<=a;++i)
		{
			c=a%10;
            b=(b*10)+c;
		    a=a/10;
		}
		System.out.println(b);
	}

}
