package collectioframework;
import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque<Integer> q=new ArrayDeque<Integer>();
q.offer(9);
q.remove(0);
q.offerFirst(7);//adds element in first
q.offerLast(0);
System.out.println(q);
int r=q.pollFirst();//removes first element
System.out.println(q);
System.out.println(r);//removed element
	
	}
}
