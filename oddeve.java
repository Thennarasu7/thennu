package ttt;
import java.util.Scanner;

public class oddeve
{
	public static void main(String[] args)
	{
	int a[]= {2,7,11,15};
	if(a[0]+a[1]==9)
		System.out.println("The two numbers are:"+a[0]+" "+a[1]);
	if(a[1]+a[2]==9)
		System.out.println("The two numbers are:"+a[1]+" "+a[2]);
	if(a[2]+a[3]==9)
		System.out.println("The two numbers are:"+a[2]+" "+a[3]);
	if(a[3]+a[1]==9)
		System.out.println("The two numbers are:"+a[3]+" "+a[1]);
	
	
	}

}
