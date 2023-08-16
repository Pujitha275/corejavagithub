package exception;

public class ClassNotFoundEx {
//compile time Example-also checked exception 
	//example-ClassNotFoundException,IOException,SQLException
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	//Class.forName("class does not exist");
	Class.forName("basic.ProtectedEx");
//	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Class found");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
//	e.printStackTrace();
	System.out.println(e);
}
	}

}
