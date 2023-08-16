package exception;

public class ArrayIndexOutofBoundEx {

	public static void main(String[] args) {
	try {
		int[]num= {1,2,3};
		System.out.println((num)[1]);
		int x=10/0;
		System.out.println(x);
		String s="abc";
		int a=Integer.parseInt(s);
		System.out.println(a);
		String s1="11";
		int a1=Integer.parseInt(s1);
		System.out.println(a1);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Some error in code"+e);//'e' (object) provides info about the error generated at runtime
	}catch (ArithmeticException a) {
		System.out.println("Some error in code"+a);
	}
	catch (NumberFormatException e) {
		System.out.println("Some error in code:"+e);
	}
	
	}

}
