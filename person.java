package com.jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class person
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/BasicJdbc","root","root");
			Statement statement=connection.createStatement();             //using statement
			statement.execute("insert into jdbc values(006,'sumanth',20,9704036904)");
			statement.execute("insert into jdbc values(007,'srikanth',22,77898922)");
			statement.execute("insert into jdbc values(008,'dhamodhar',24,36904)");
			statement.execute("insert into jdbc values(009,'chandra',26,97040)");
			statement.execute("insert into jdbc values(010,'sumanth',20,9704036904)");
			connection.close();
		} 
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
