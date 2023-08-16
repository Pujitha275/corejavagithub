package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/capgemini";
		Connection con=DriverManager.getConnection(url,"root","puji");//username ,password
		System.out.println(con);
		System.out.println("Database dbstudent connection suceesfully establish");
	   // stmt=(statement) com.createStatement();
		 String query1 = "insert into engineer(Eid,Ename,Esalary,Edoj,Eaddress) values(?,?,?,?,?)";
		 PreparedStatement ps=con.prepareStatement(query1);
		 ps.setInt(1,10);
		 ps.setString(2, "sindhu");
		 ps.setInt(3, 80000);
		 ps.setString(4, "2013/03/04");
		 ps.setString(5, "vizag");
		 int i=ps.executeUpdate();
		 System.out.println("record inserted ");
		 con.close();
	
	}

}
