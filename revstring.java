package ttt;

import java.util.Scanner;

public class revstring
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String str1=new StringBuffer(str).reverse().toString();
    System.out.println(str1);
	}

}
