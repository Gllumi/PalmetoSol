package cts6;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		A1 a= new A1();
		try {
			a.inval(st);
		}
		catch(InvalidFormatException e) {
			System.out.println(e);
		}
		

	}

}
class A1{
	public void inval(String s) throws InvalidFormatException{
		int n = Integer.parseInt(s);
		if(n==n) {
			System.out.println(n*n);
		}
		else {
			throw new InvalidFormatException();
		}
	}
	
}
