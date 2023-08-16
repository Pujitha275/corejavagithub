package collectioframework;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetEx {

	public static void main(String[] args) {
		
HashSet name=new HashSet();
name.add("zeba");
name.add("Suji, Pujitha");
name.add("Pujitha");
name.add("Bittu");
int size=name.size();
System.out.println(name.size());
System.out.println(name);
Iterator iterator=name.iterator();
while(iterator.hasNext()) {
	String name1=(String)iterator.next();
	System.out.println(name1);
	boolean b=name.contains("Ziba");
	System.out.println("contains ziba"+b);
}
}

}
