package assess4;

import java.util.ArrayList;
import java.util.Scanner;

public class Assessment4 {
	public ArrayList performSetOperations(int e,ArrayList a,ArrayList b,char s) {
		ArrayList arr = new ArrayList();
		int n;
		if(s=='+') {
			for(int i=0;i<e;i++) {
				for(int j=0;j<e;j++) {
					n=(int) a.get(i);
					arr.add(n);
					if(a.get(i)!=b.get(j)) {
						n=(int) b.get(j);
						arr.add(n);
						
					}
				}
			}
		}
		else if(s=='*') {
			for(int i=0;i<e;i++) {
				for(int j=0;j<e;j++) {
					if(a.get(i)==b.get(j)) {
						n=(int) a.get(i);
						arr.add(n);
					}
				}
			}
		}
		else if(s=='-') {
			for(int i=0;i<e;i++) {
				for(int j=0;j<e;j++) {
					if(a.get(i)!=b.get(j)) {
						n=(int) a.get(i);
						arr.add(n);
					}
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assessment4 as = new Assessment4();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter no of ele in 1st");
		int n1 = sc.nextInt();
		//System.out.println("ENter no of ele in 2nd");
		//int n2 = sc.nextInt();
		
		ArrayList ar1 = new ArrayList();
		ArrayList ar2 = new ArrayList();
		
		System.out.println("Enter elements for 1st");
		for(int i=0;i<n1;i++) {
			ar1.add(i, sc.nextInt());
			
		}
		//System.out.println(ar1);
		
		System.out.println("Enter elements for 2nd");
		for(int i=0;i<n1;i++) {
			ar2.add(i, sc.nextInt());
			
		}
		System.out.println("Enter the operation to perform");
		String c = sc.next();
		char v = c.charAt(0);
		
		System.out.println(as.performSetOperations(n1,ar1, ar2, v));
	}

}
