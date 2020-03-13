package test;
//import java.util.*;
import java.util.Scanner;

public class NumberValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		numVal(a);
		

	}
	public static void numVal(String in) {
		if(in.matches("[0,9]{3}[-]{1}[0,9]{3}[-]{1}[0,9]{4}"))
			System.out.println("Entered number is Valid");
		else
			System.out.println("Entered Number is invalid");
	
	}

}
