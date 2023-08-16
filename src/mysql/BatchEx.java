package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Delete;

public class BatchEx {

	public static void insert(List<PersonEntity>personEntities) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/capgemini";
		Connection con=DriverManager.getConnection(url,"root","puji");//username ,password
		String query="Insert into person values(?,?) ";
		PreparedStatement preparedStatement = con.prepareStatement(query);
		for (PersonEntity personEntity : personEntities) {
			preparedStatement.setInt(1, personEntity.getId());
			preparedStatement.setString(2, personEntity.getName());
			preparedStatement.addBatch();
		}
		preparedStatement.executeBatch();
	}
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	List<PersonEntity> i=new ArrayList<>();
	i.add(new PersonEntity(1, "Pujitha"));
	i.add(new PersonEntity(2, "Charan"));
	i.add(new PersonEntity(3, "Suhail"));
	i.add(new PersonEntity(4, "Bittu"));
	insert(i);
	System.out.println("record inserted");
}
}