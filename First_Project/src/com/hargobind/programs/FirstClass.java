package com.hargobind.programs;

import java.util.Scanner;

public class FirstClass {
	
	public static void main(String[] args)
	{
		String name;
		String status;
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi, What is your name");
		name= scan.next();
		
		System.out.println("hello " + name +" ,what is your age ");

		age= scan.nextInt();
		
		System.out.println(name + " ,your age is " + age + "?" );
		status=scan.next();
		
		System.out.println(" You seem to be much younger than this.");
		
	}

}
