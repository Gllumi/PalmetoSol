package assess2;

import java.util.Scanner;

public class Assessment2 {

	public static void main(String[] args) throws InsufficientAgeException, InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("***Enter Voter's Age***");
		int n = sc.nextInt();
		if(n<18&&n>0) {
			throw new InsufficientAgeException();
		}
		else if(n<0) {
			throw new  InvalidAgeException();
		}
		else {
			System.out.println("Entered Age Is Valid");
		}
	}

}
