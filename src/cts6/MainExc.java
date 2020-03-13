package cts6;

import java.util.Scanner;

public class MainExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		Exc a = new Exc();
		try {
			a.odd(n);
		}
		catch(OddNumberException e) {
			System.out.println(e);
		}
		
	}

}

class Exc{
	public void odd(int n) throws OddNumberException {
		if(n%2!=0) {
			throw new OddNumberException();
		}
		else {
			System.out.println(n);
		}
	}
}