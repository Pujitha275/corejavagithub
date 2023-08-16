package collectioframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> s=new ArrayList<String>();
s.add("pujitha");
s.add("bittu");
s.add("suhail");
s.add("charan");
System.out.println(s);
Collections.sort(s);
Iterator<String> i=s.iterator();
while(i.hasNext()){
	System.out.println(i.next());
}
	}

}
