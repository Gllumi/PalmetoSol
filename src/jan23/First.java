package jan23;

import java.util.Scanner;

public class First {
	
	public static int vowel(String s) {
		int temp = 0;
		int count = 0;
		int n = s.length();
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
			if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				if((s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')&&s.charAt(i)!=s.charAt(j)) {
					temp=1;
				}
						
			}
			
			}
		
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b="";
		int n = a.length();
		for(int i=n-1; i>=0;i--) {
	    	   b=b+a.charAt(i); 
	      }
		if (a.equalsIgnoreCase(b)&& vowel(a)==1) {
			System.out.println("True");
		}
		/*else if(a.equalsIgnoreCase(b)) {
			System.out.println("Just Palindrome");
		}*/
		else {
			System.out.println("False");
		}
	}
	

}
