package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {

	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet res;

	Employee()
	{
		con=null;
	}

	public Connection getConnection()
	{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/training","root","Nandhu123");
		}
		catch(Exception e){
			System.out.println(e);
		}
		return con;
	}
	public void insertEmployee(int cid, String name, String city, String contact) throws SQLException 
	{

		con=getConnection();
		System.out.println("**************** Insert new Employees*****************");
		String s="INSERT INTO user(cid,name,city,contact) VALUES(?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(s);

			ps.setInt(1, cid);
			ps.setString(2, name);
			ps.setString(3, city);
			ps.setString(4, contact);

			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("Employee Details Inserted Successfully!!!!");
			}
			con.close();
			ps.close();
		}
		catch (Exception e) {

			System.out.println(e);
		}

	}

	public void getEmployee() 
	{
		System.out.println("**************** Display Employees*****************");
		try {
			con=getConnection();
			st=con.createStatement();
			res=st.executeQuery("select * from user");
			System.out.println("Id\t Name\t City\t Contact");
			System.out.println("-----------------------------------");

			while(res.next())
			{
				System.out.print(res.getInt(1)+"\t");
				System.out.print(res.getString(2)+"\t");
				System.out.print(res.getString(3)+"\t");
				System.out.print(res.getString(4)+"\n");
			}
			System.out.println("-----------------------------------");
			res.close(); con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

	public void updateEmployee(int id,String city) 
	{
		System.out.println("**************** Update Employees*****************");
		String s="UPDATE user SET city = ? WHERE cid=?";
		try {
			con=getConnection();

			PreparedStatement ps=con.prepareStatement(s);

			ps.setInt(2, id);
			ps.setString(1, city);

			ps.executeUpdate();
			System.out.println("Employee city updated successfully!!!!");
			System.out.println("-----------------------------------");
            con.close();
            ps.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void deleteEmployee(int cid) 
	{
		System.out.println("**************** Delete Employees*****************");
		String s="DELETE FROM user WHERE cid=?";
		try {
			con=getConnection();

			PreparedStatement ps=con.prepareStatement(s);

			ps.setInt(1, cid);

			ps.executeUpdate();
			System.out.println("Employee Deleted  Successfully!!!!");
			System.out.println("-----------------------------------");
            con.close();
            ps.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
