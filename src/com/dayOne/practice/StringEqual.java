package com.dayOne.practice;

import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
		   System.out.print("Enter first String :");
		   String str=sc.nextLine();
		   System.out.print("Enter second String :");
		   String str1=sc.nextLine();
		   sc.close();
		   System.out.println(str.equals(str1));
		   System.out.println(str.equalsIgnoreCase(str1));
		  /* String s1="Suchit";  
		   String s2="Suchit";  
		   String s3=new String("Suchit");  
		   String s4="Diksha";  
		   System.out.println(s1.equals(s2));  
		   System.out.println(s1.equals(s3));
		   System.out.println(s1.equals(s4));*/
		   

	}

}
