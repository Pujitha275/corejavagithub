package exception;
import java.io.FileNotFoundException;
public class ThrowsException {

	public static void main(String[] args) throws ClassNotFoundException,FileNotFoundException {
		// TODO Auto-generated method stub
Class.forName("basic.ArrayEx");
System.out.println("class found");
	}

}
