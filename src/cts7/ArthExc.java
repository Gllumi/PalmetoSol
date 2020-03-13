package cts7;

import java.util.Scanner;

public class ArthExc extends Exception {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		try{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
