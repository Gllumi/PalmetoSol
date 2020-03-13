package cts5;

import java.util.Scanner;

public class Sumabc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]=new int[3];
		int sum=0;
		for(int i =0; i<3;i++) {
			a[i]=sc.nextInt();
			
			
			if (a[i]==13) {
				break;
			}
			sum+=a[i];
		}
		System.out.println(sum);
		
	}

}
