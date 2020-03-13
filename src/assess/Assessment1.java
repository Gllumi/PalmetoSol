package assess;

import java.util.Scanner;

public class Assessment1 {
	public boolean test(String t) {
		boolean temp =false;
		for(int i=0;i<t.length();i++) {
			
				if(i>4&&(t.charAt(i)<9)) {
					temp = true;
				}
				if((i==t.length()-1)&&(t.charAt(i)!=i)) {
				
					temp=true;
				}
	
			 
		}return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Assessment1 a = new Assessment1();
		System.out.println("Enter Your PAN Number");
		String s = sc.next();
		if(s.length()==10) {
			if(a.test(s)) {
				System.out.println("VALID PAN NUMBER");
			}
		}
		else {
			System.out.println("NOT A VALID PAN NUMBER");
		}
	}

}
