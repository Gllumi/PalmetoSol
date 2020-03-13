package cts9;
import java.io.*;
import java.sql.*;
import java.util.*;
public class RBFConcept {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream ("d://ctsdb.properties");
			Properties p = new Properties();
			p.load(fis);
			String dname = (String) p.get("Dname");
			String url = (String) p.get("URL");
			String username = (String) p.get("Uname");
			String password = (String) p.get("pwd");
			
			Scanner sc=new Scanner(System.in);
			System.out.println();
			String tablename = sc.next();
			
			Class.forName(dname);
			System.out.println("Driver Loaded");
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Created");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from "+tablename);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("===================================");
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.println(rsmd.getColumnName(i)+ " ");
				
			}
			System.out.println("===================================");
			while(rs.next())
			{
				for(int j=1; j <=rsmd.getColumnCount(); j++) {
					System.out.println(rs.getString(j)+" ");
					
				}
				System.out.println(" ");
				
			}
			/*con.commit();
			  con.rollback ();*/
			con.close();
			
		}
		catch(Exception e) {}
	}
}
