package test;

import java.util.Scanner;

class InvalidEntryException extends Exception{
	public InvalidEntryException() {
		super("Subject Marks cannot be -ve or more than 100");
	}
}

public class AvgMrks {
	public void AvgMrk(int a,int b,int c,String s) throws InvalidEntryException {
		int z;
		if (a<0||b<0||c<0) {
			throw new InvalidEntryException();
		}
		else if(a>100||b>100||c>100){
			throw new InvalidEntryException();
		}
		else {
			z= (a+b+c)/3;
			System.out.println("Average marks of "+s+" is "+z);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name and Marks of 1st Student");
		String s1 = sc.next();
		int p1 = sc.nextInt();
		int c1 = sc.nextInt();
		int m1 = sc.nextInt();
		AvgMrks avg = new AvgMrks();
		try {
			avg.AvgMrk(p1,c1,m1,s1);
		}
		catch(InvalidEntryException e1) {
			System.out.println(e1);
		}
		System.out.println("Enter Name and Marks of 2nd Student");
		String s2 = sc.next();
		int p2 = sc.nextInt();
		int c2 = sc.nextInt();
		int m2 = sc.nextInt();
		AvgMrks avg2 = new AvgMrks();
		try {
			avg2.AvgMrk(p2,c2,m2,s2);
		}
		catch(InvalidEntryException e2) {
			System.out.println(e2);
		}
	}

}
