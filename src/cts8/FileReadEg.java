package cts8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadEg {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		char ch;
		int x;
		try(FileReader fin = new FileReader("d://File.txt");
				FileWriter fout = new FileWriter("d://fileo.txt"))
		{
			x=fin.read();
			while(x!=-1) {
				ch=(char)x;
				fout.write(ch);
				System.out.print(ch);
				x=fin.read();
			}
		}
	}

}
