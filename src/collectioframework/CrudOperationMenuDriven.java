package collectioframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Learner{
	int lno;
	String lname,ldegree;
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLdegree() {
		return ldegree;
	}
	public void setLdegree(String ldegree) {
		this.ldegree = ldegree;
	}
	public Learner(int lno, String lname, String ldegree) {
		super();
		this.lno = lno;
		this.lname = lname;
		this.ldegree = ldegree;
	}
	@Override
	public String toString() {
		return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
	}
	
}
public class CrudOperationMenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Learner> l=new ArrayList<Learner>();
Scanner s=new Scanner(System.in);
int choice;
do {
	System.out.println("1. Insert data ");
	System.out.println("2. Display data ");
	System.out.println("3. Search data");
	System.out.println("4. del data");
	System.out.println("Enter your choice: ");
	choice=s.nextInt();
	switch(choice) {
	case 1:
		System.out.print("Enter lno ");
		int lno=s.nextInt();
		System.out.print("Enter lname ");
		String lname=s.next();
		System.out.print("Enter ldegree ");
		String ldegree=s.next();
		l.add(new Learner(lno, lname, ldegree));
		break;
	
	case 2:
		Iterator<Learner> i=l.iterator();
		while(i.hasNext()) {
			Learner le=i.next();
			System.out.println(le);
		}
			break;
			
			case 3:
				boolean found=false;
				System.out.println("Enter lno to search: ");
				int lnu=s.nextInt();
				Iterator d=l.iterator();
				 while (d.hasNext()) {
                     Learner f= (Learner) d.next();
                     if (f.getLno() == lnu) {
                         System.out.println(f);
                         found = true;
                        
                     }
                   
                 }
                 if (!found) {	
                	 System.out.println("Record Not Found");
                 }
                 break;
			case 4:
				System.out.println("Enter lno to del: ");
				int lnotodel;
				lnotodel=s.nextInt();
			
			boolean isdeleted=false;
			Iterator<Learner> e=l.iterator() ;
			while(e.hasNext()) {
				Learner le=e.next();
				if(le.getLno()==lnotodel) {
					
					e.remove();
					isdeleted=true;
				}
				if(isdeleted) {
					System.out.println("Record has been deletd");
				}
				else {
					System.out.println("lno not found so deletion failed");
				}
			}
				
                	 }
                 }
while(choice!=0);

}
}




//ArrayList<Details> d=new ArrayList<Details>();
//Scanner s=new Scanner(System.in);
//int choice;
//do {
//	System.out.println("1. Insert data ");
//	System.out.println("2. Display data ");
//	System.out.println("3. Search data");
//	System.out.println("4. del data");
//	System.out.println("Enter your choice: ");
//	choice=s.nextInt();
//switch(choice) {
//case 1:
//	System.out.print("Enter lname ");
//	String Lname=s.next();
//	System.out.print("Enter lcourse ");
//	String Lcourse=s.next();
//	System.out.print("Enter lno ");
//	int Lno=s.nextInt();
//	System.out.print("Enter age ");
//	int age=s.nextInt();
//	break;