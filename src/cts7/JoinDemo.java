package cts7;
class HT extends Thread{
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println("Hello World");
			try {
				sleep(0);
			}
			catch(Exception e) {
				
			}
		}
	}
}

public class JoinDemo {
	public JoinDemo() {
		
	}
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		HT h1=new HT();
		h1.start();
		h1.yield();
		for(int i=0;i<=50;i++) {
			System.out.println("Main Thread");
		}
	}

}
