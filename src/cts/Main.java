package cts;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      int n1 = scanner.nextInt();
      int n2 = scanner.nextInt();
      int a[]=new int[n1];
      int b[]=new int[n2];
      for(int i=0; i<n1;i++) {
    	   a[i]= scanner.nextInt(); 
      }
      for(int j=0; j<n2; j++) {
    	  b[j]= scanner.nextInt();
      }
     
      
     
      System.out.println(UserMainCode.commonElements(a,b));
	}
	
	
	

}
