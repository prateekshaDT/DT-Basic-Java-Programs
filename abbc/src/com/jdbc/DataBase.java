package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBase {
public static void main(String[] args) {
		
		Connection con=null;
		try {
			Class.forName("org.h2.Driver");
		}
	catch (ClassNotFoundException e) {
						e.printStackTrace();
		}
		
		try {
		con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		System.out.println(" connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Statement st=null;
		try {
			st = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			st.execute("insert into student values ('ac',7,21,'cpt')");
			System.out.println(" inserted in to table student");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ResultSet rt=st.executeQuery("select * from student");
			
			while(rt.next())
			{
				System.out.println(rt.getString(2)+" "+rt.getInt(1)+" "+rt.getInt(1)+" "+rt.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
}



		