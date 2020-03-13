package cts8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.*;
public class BufferFileReadEg {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(
		InputStreamReader ipr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ipr))
		{
			System.out.println("Enter Name");
			String name = br.readLine();
			System.out.println("Enter City");
			String city = br.readLine();
			System.out.println("Name is " +name);
			System.out.println("City is " +city);
		}
	}

}
