package ttt;

import java.util.Scanner;

public class eveoddstr
{

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the string");
     String str=sc.nextLine();
     String str1="";
     String str2="";
     int b=0;
     int c=1;
     int a=str.length();
     for(int i=0;i<--a;++i)
     {
    	 str1+=str.charAt(b);
    	 str2+=str.charAt(c);
    	 c+=2;
    	 b+=2;
    	 
     }
     System.out.println(" the odd string"+" "+str2);
     System.out.println(" the even string"+" "+str1);
	}

}
