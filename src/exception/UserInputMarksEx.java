package exception;
import java.util.Scanner;
public class UserInputMarksEx {
static void Marks(int marks) {

	if(marks>0 || marks<=100){
		System.out.println(marks);
	}else {
		throw new ArithmeticException("Invalid number ");
	}
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter marks: ");
		int marks=s.nextInt();
		Marks(marks);
	}

}
