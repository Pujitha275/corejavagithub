package collectioframework;
import java.util.*;
public class PriorityQueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>() {

	public int compare(Integer lhs, Integer rhs) {
		if(lhs<rhs)return +1;
		if(lhs.equals(rhs)) return 0;
		return -1;
	}
	
});
pq.add(9);
pq.add(7);
pq.add(2);
pq.add(8);
pq.add(3);
pq.add(0);
System.out.println("The max priority queue contents: ");
Integer val = null;
while((val = pq.poll())!= null){
	System.out.println(val+" ");
	
	
}
	}

}
