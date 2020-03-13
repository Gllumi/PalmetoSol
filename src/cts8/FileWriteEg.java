package cts8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriteEg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(InputStreamReader cin=new InputStreamReader(System.in)){
				FileOutputStream out = new FileOutputStream("D://File.txt");
				System.out.println("Enter");
				char c;
				do {
					c = (char)cin.read();
					out.write(c);
					
				}while(c !='q');
	}	
	}
}
