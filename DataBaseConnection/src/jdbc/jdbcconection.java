package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public   class jdbcconection
{
public static ArrayList<String> jdbc() throws SQLException
	{
		ArrayList<String> al = new ArrayList<String>();
		String host="localhost";

		String port= "3306";
		//connection line 
		Connection con= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/ra","root","AmazonR@5");
		
		//to pass our sql statements 
		Statement s=con.createStatement();
		ResultSet rs = s.executeQuery("select * from employee");
		while(rs.next())
		{
			//use rs.getSring(int columnindex)
			String names =  rs.getString("name");
			
			al.add(names);
		}
		return al;}}
