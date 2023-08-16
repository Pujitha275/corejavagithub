package collectioframework;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> l=new LinkedList<Integer>();
l.add(89);
l.add(9);
l.add(77);
l.add(34);
Collections.sort(l);
System.out.println(l);
Iterator<Integer> i=l.iterator();
while(i.hasNext()) {
	System.out.println(i.next());
}
	}

}
