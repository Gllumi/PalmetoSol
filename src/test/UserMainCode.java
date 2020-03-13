package test;

import java.util.Scanner;

public class UserMainCode {
	public static void checkSum(int n) {
		int a,b=0;
		while(n!=0) {
			a= n%10;
			if(a%2!=0)
				b+=a;
			n=n/10;
		}
		if(b%2==0) {
			System.out.println("Sum of odd numbers is even");
			
		}
		else {
			System.out.println("Sum of odd numbers is odd");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		UserMainCode u = new UserMainCode();
		u.checkSum(n);
	}
}
