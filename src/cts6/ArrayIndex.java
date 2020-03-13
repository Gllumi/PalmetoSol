package cts6;

import java.util.Scanner;

public class ArrayIndex {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int a[]= new int[n];
		for(int i=0; i<n;i++) {
	    	   a[i]= sc.nextInt(); 
	      }
		System.out.println("Enter the index of the array element you want to access");
		int m = sc.nextInt();
		A2 z =new A2();
		try {
			z.AIOB(m, n, a);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}


class A2{
	public void AIOB(int a, int b,int[] n) throws ArrayIndexOutOfBoundsException{
		if(a<b && a>0) {
			System.out.println("The array element at index" +a+ "=" +n[a]);
			System.out.println("The array element successfully accessed");
		}
		else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
}
