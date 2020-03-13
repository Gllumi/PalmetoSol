package cts2;

public class Area {
	
	public  void areaSquare(int a) {
		int temp2;
		temp2 = a*a;
		System.out.println(temp2);
	}
public void areaquad(int a, int b, int c, int d) {
		System.out.println(a+b+c+d);
	}
public void areaRect(int p, int q) {
	int temp1;
	temp1 = p*q;
	System.out.println(temp1);
}
public void areaTriangle(int x, int y, int z) {
	int temp;
	temp = x+y+z;
	System.out.println(temp);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        Area a = new Area();
        a.areaSquare(40);
        a.areaquad(12, 23, 12, 23);
        a.areaTriangle(12, 10, 8);
        a.areaRect(12, 14);
        
        
         
	}

}
