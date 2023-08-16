package exception;

public class UserDefinedMovie {
	//static void validateAge(int age) {
		 void validateAge(int age) {
		if(age>18) {
			System.out.println("welcome to movie");
		}
		else {
			throw new ArithmeticException("invalid age for movie");
		}
	}
	public static void main(String[] args) {
	UserDefinedMovie s=new UserDefinedMovie();
	//validateAge(21);
	s.validateAge(21);

	}

}
