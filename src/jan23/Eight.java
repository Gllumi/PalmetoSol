package jan23;

import java.util.Arrays;
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=n+2;
		int[] a= new int[m]; 
		//int[] b= new int[m]; 
		int temp=0;
		int sum=0;
		
		//a[0]=1;
		for(int i =1;i<m;i++) {
			//for(int j =1;j<n;j++)
				if(i%2!=0) {
					a[i]=i;			 
				}
				else
					continue;
			sum+=a[i];	
		}
		
		//System.out.println(Arrays.toString(a));
		for(int i=5;i<m ;i++) {
			if(i%4==1) {
				temp+=(i);
				//b[i]=i;
			}
		}
		System.out.println(sum-(2*temp));
	}

}
