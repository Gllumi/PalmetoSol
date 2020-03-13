package jan23;

import java.util.Scanner;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=0;
		int sum=0;
		for(int i =0;i<10;i++) {
			temp = n%10;
			if(temp%2==0) {
				temp=temp*temp;
				sum+=temp;
			 
			}
			
			n=n/10;
		}
		System.out.println(sum);
	}

}
