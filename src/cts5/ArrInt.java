package cts5;

import java.util.Scanner;

public class ArrInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int temp = 0; 
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i =0 ; i<n; i++) {
			 a[i] = sc.nextInt();
		}
		for (int i =0 ; i<n; i++) {
			 if(a[i]!=10) {
				 System.out.print(a[i]);
			 }
		}
		for (int i =0 ; i<n; i++) {
			 if (a[i]==10) {
				 temp = a[i]%10;
				 System.out.print(temp);
			 }
		}
		

	}

}
