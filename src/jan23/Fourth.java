package jan23;

import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = s.toUpperCase();
		System.out.println(s1);
		System.out.println(s);
		if(s1.equals(s)) {
			System.out.println("YES");
		}
		else {
			System.out.println("No");
		}
		/*int n =sc.nextInt();
		int x=s.length();
		String s1="";
		String s2="";
		for(int i=0;i<=n-1;i++) {
			 s1+=s.charAt(i);
			//System.out.print(s.charAt(i));
		}
		for(int i=x-n;i<x;i++) {
			 s2+=s.charAt(i);
			//System.out.print(s.charAt(i));
		}
		System.out.println(s1+s2);*/
		
	}

}
