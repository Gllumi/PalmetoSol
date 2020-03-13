package cts8;
import java.util.*;
import java.io.*;

public class Two {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Properties p = new Properties();
		FileReader fout = new FileReader("d://properties.txt");
		p.load(fout);
		System.out.println(p.getProperty("uname"));
		System.out.println(p.getProperty("pwd"));
		Set s = p.stringPropertyNames();
		System.out.println(s);
		fout.close();
	}

}
