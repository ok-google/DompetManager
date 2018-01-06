package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Koneksi {
	public Connection koneksi;
	public Statement query;
	
	public Connection sambungkan(){
		try {
	        String url ="jdbc:mysql://localhost/dompetManager";
	        String user="root";
	        String pass="";
	        Class.forName("com.mysql.jdbc.Driver").newInstance();
	        
	        koneksi =DriverManager.getConnection(url,user,pass);
	        query = koneksi.createStatement();
	    } catch (Exception e) {
	        System.err.println("koneksi gagal " +e.getMessage());
	    }
		
		return koneksi;
	}

}
