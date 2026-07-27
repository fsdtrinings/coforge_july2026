package main;

import java.sql.SQLException;

import db.ProductDB;

public class MyApp {
	
	public static void main(String[] args) {
		
		try {
			ProductDB db = new ProductDB();
		} catch (Exception e) {
			System.err.println(e);
		}
		
	}
	

}
