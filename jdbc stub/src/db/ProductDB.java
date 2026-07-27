package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDB {

	String host = "localhost:3306";
	String database = "cfg";
	String url = "jdbc:mysql://" + host + "/" + database;

	Connection con;
	PreparedStatement ps; // sql query 

	public ProductDB() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // loading a driver class
		con = DriverManager.getConnection(url, "root", "root");
		System.out.println("con " + con);

	}

}// end class









