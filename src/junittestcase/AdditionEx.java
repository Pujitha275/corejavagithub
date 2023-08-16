package junittestcase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class AdditionEx {
	String s="a";
	String s1="b";
	@Test
	public void test1() {
		assertNotSame(s1, s);
	}
	@Test
	public void test() {
		assumeNotNull(s);
	}
public int add(int a,int b) {
	return a+b;
}
@Test
public void addTest() {
	assertEquals(7,add(4,3));
}
 public int sub(int c,int d) {
	return c-d;
}
@Test
public void subTest() {
	assertEquals(20, sub(30,10));
}
public int mul(int c,int d) {
	return c*d;
}
@Test
public void mulTest() {
	assertEquals(20, mul(2,10));
}
public String evenodd(int a) {
	if(a%2==0) {
	return "even" ;	
	}else {
		return "odd" ;
	}
}
@Test
public void evenoddTest() {
	assertEquals("even",evenodd(16) );
}
public int fact(int n) {
int	fact=1;
	for(int i=1;i<=n;i++) {
		fact=fact*i;
	}
	return fact;
}
@Test
public void factTest() {
	assertEquals(24, fact(4));
}
public String  name(String n ) {
	return n;
}
@Test
public void name() {
	assertSame("puji", "puji");
}
public String  name1(String n ) {
	return n;
}
@Test
public void name1() {
	assertNotSame("puji","suji" );
}
public String  name2(String n ) {
	return n;
}
@Test
public void name2() {
	assertNull(null);
}
public String  name3(String n ) {
	return n;
}
@Test
public void name3() {
	assertNotNull(" ");
}
}