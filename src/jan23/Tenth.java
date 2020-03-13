package jan23;

import java.util.Scanner;

public class Tenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int n = s.length();
		if (n>7) {
			System.out.println("wrong");
		}
		boolean temp=false;
		for(int i = 1 ;i<n;i++) {
			if((s.charAt(i)>=0&&s.charAt(i)<=9)||s.charAt(i)=='a'||s.charAt(i)=='b'||s.charAt(i)=='c'
					||s.charAt(i)=='d'||s.charAt(i)=='e'||s.charAt(i)=='f') {
				temp=true;
			}
			/*else if(s.charAt(0)=='#') {
				temp=true;
			}*/
			else {
				temp=false;
			}
		}
		if(temp=true&&s.charAt(0)=='#') {
			System.out.println("Correct Code");
		}
		else {
			System.out.println("Wrong");
		}
	}

}
