package cts2;

public class Main {
	static int noOfObjects =0; 
    Main(){ 
        noOfObjects += 1; 
    } 
   public void count() {
	   System.out.println(noOfObjects);
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		Main m1= new Main();
		Main m2 = new Main();
		m2.count(); 
	}

}
