package com.My_marathon.Dao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.My_marathon.model.employee;

public class EmployeeDao {
	public int registerEmployee(employee emp) throws SQLException
	{
		String INSERT_INTO_SQL ="insert into registration"+
	"(first_name,Last_name,mid_name,Email_id,address,Phone_Number,state,country,district,pin_code,password)values"+
				"(?,?,?,?,?,?,?,?,?,?,?);";
		
		
		/*String INSERT_INTO_SQL ="insert into sample"+
				"(Firstname,Last_name)values"+
							"(?,?);";
		*/
		
		try{    
			//Class.forName("com.mysql.jdbc.Driver");  THIS IS DEPRICATED HENCE USING THE ONE BELOW..
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/marathon","root","@n@ndA@321");  
			//here sonoo is database name, root is username and password  
			PreparedStatement prd_st = con.prepareStatement(INSERT_INTO_SQL);
			
			prd_st.setString(1, emp.getFirstname());
			System.out.println("Fname --"+emp.getFirstname());
			prd_st.setString(2, emp.getLastname());
			System.out.println("last Nmae --"+emp.getLastname());
			prd_st.setString(3, emp.getMid_name());
			prd_st.setString(4, emp.getEmail_id());
			prd_st.setString(5, emp.getAddress());
			prd_st.setString(6, emp.getPhoneNumber());
			prd_st.setString(7, emp.getState());
			prd_st.setString(8, emp.getCountry());
			prd_st.setString(9, emp.getDistrict());
			prd_st.setString(10, emp.getPincode());
			prd_st.setString(11, emp.getPassword());
			
			
			
			prd_st.executeUpdate();
			System.out.println("The data from insert ------------------------------------------");
			System.out.println(INSERT_INTO_SQL);
			
		
	}
 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	
}
}
