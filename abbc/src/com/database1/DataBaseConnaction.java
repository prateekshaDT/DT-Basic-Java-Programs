package com.database1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DataBaseConnaction {
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
			st.execute("insert into car values (25,'red')");
			System.out.println(" inserted in to table car");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ResultSet rt=st.executeQuery("select * from car");
			
			while(rt.next())
			{
				System.out.println(rt.getInt(1)+" "+rt.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
}



