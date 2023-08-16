package collectioframework;

import java.util.PriorityQueue;

class Learner9 implements Comparable<Learner9>{
	int age;
	String name;
	public int getRno() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Learner9(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Learner [age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Learner9 o) {
		if(age>o.age)
		return 0;
		return age;
	}
	
}
public class PriorityQueueE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Learner9> p=new PriorityQueue<Learner9>();
p.add(new Learner9(23," bittu"));
p.add(new Learner9(21," Puji"));
p.add(new Learner9(22," cherry"));
p.add(new Learner9(23," uma"));
while(!p.isEmpty())
{
	System.out.println(p.remove());
}


	}

}

