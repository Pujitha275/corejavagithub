package mysql;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class checkConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //registering driver-driver class
		String url="jdbc:mysql://localhost:3306/emp";//connection url
		Connection con=DriverManager.getConnection(url,"root","puji");//username ,password
		System.out.println(con);
		System.out.println("Database dbstudent connection suceesfully establish");
	   // stmt=(statement) com.createStatement();
		 //Statement stmt = con.createStatement();
		//to execute procedure
		CallableStatement statement = con.prepareCall("{call details_procedure()}");

			statement.execute();
			statement.close();

			System.out.println("Stored procedure called successfully!");
//		"To insert the data"
//		 String query1 = "insert into engineer values(8,'bittu', 200000,'2023-04-20' ,'anantapur')";
//		 stmt.executeUpdate(query1);
//       System.out.println("record inserted successfully");
////		"to update the data"
//		 String query2 = "update engineer set eaddress='anantapur' where ename='saddam'";
//		 stmt.executeUpdate(query2);
//		 System.out.println("record updated successfully");
//		"To print the result
		// ResultSet rs = null;
//			rs = stmt.executeQuery("select * from engineer");
//
//			System.out.println("No of Records:");
//			while (rs.next()) {
//				// Display values
//				System.out.print("EID: " + rs.getInt("eid"));
//				
//				System.out.print(" ,Ename: " + rs.getString("ename"));
//				
//				System.out.println(" ,esalary: " + rs.getInt("esalary"));
//	
//				System.out.println(" ,edoj: " + rs.getDate("edoj"));
//
//
//				System.out.println( " ,Eaddress : "+rs.getString("eaddress"));
//
//			}
	
	}

}
