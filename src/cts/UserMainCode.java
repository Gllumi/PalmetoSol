package cts;

public class UserMainCode {

	public static int commonElements(int[] a,int[] b) {
		int temp=0, sum=0;
		for(int i=0;i<a.length;i++) {
			temp = a[i];
			int tem=0;
			for(int j=0;j<b.length;j++) {
				tem=b[j];
				if(a[i]==b[j]) {
					
					sum+=b[j];
				}
			}
		}return sum;
	}
		
	
}