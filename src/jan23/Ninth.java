package jan23;

import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		String s = sc.next();
		int n=Integer.parseInt(s);
		int temp=0;
		int sum=0;
		for(int i =0;i<10;i++) {
			temp = n%10;
			sum+=temp;
			
			n=n/10;
		}
		System.out.println(sum);
	}

}
