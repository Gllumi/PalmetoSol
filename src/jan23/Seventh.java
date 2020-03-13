package jan23;

import java.util.Scanner;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[] ar= new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int max=0,min=100;
		int sum=0;
		for(int i=0;i<n;i++) {
			//int min;
			if(ar[i]>max) {
				max=ar[i];
				
			}
			if(ar[i]<min) {
				min=ar[i];
			}
			
		}
		sum=max-min;
		System.out.println(sum);
	}

}
