package com.onebill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onebill_1", "root",
					"Pavithran@1125");
			Statement statement = connection.createStatement();
			//boolean execute = statement.execute("insert into table_1 values (1, 'mukil vro')");
//			System.out.println(execute);
			ResultSet set = statement.executeQuery("Select * from table_1");
			while(set.next()) {
				
				System.out.println(set.getInt(1)+" : "+set.getString(2));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
