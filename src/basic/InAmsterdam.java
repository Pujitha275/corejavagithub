package basic;
import java.util.Scanner;
 class Amsterdam { 

			public int countAm(String s) {
				String str = s.toLowerCase();
				//System.out.println("str :"+str);
				int cnt = 0;
				String a[] = str.split(" ");
				for (int i = 0; i < a.length; i++) {
					if (a[i].equals("am")) {
						cnt = cnt + 1;
					}
					
				}
				return cnt;

			}
		}

public class InAmsterdam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter string");
String s=scan.nextLine();
Amsterdam i=new Amsterdam();
int count=i.countAm(s);
System.out.println("Print count: "+count);
	}

}
