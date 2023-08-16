package collectioframework;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		TreeSet name=new TreeSet();
		//name.add("suji, Pujitha");
		name.add("Pujitha");
		name.add("Bittu");
		name.add("Zeba");
		name.add("Charan");
		name.add("Suhail");
		
		//Iterator iterator=name.iterator();
		Iterator itr=name.descendingIterator();

//		while(iterator.hasNext()) {
//			String name1=(String)iterator.next();
			while(itr.hasNext()) {
//				String name1=(String)itr.next();
//				System.out.println(name1);
			System.out.println(itr.next());

	  }
	}

}
