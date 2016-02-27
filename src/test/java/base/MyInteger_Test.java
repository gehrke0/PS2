package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
@Test
public void testisEven(){
	int iIntegerTestValue = 4;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedResult = true;
	boolean bActualResult = instance.isEven();
	assertEquals("testisEven() failed", bExpectedResult, bActualResult);
}
@Test
public void testisEven2(){
	int iIntegerTestValue = 5;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedResult = false;
	boolean bActualResult = instance.isEven();
	assertEquals("testisEven() failed", bExpectedResult, bActualResult);
}
@Test
public void testisOdd(){
	int iIntegerTestValue = 5;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedResult = true;
	boolean bActualResult = instance.isEven();
	assertEquals("testisEven() failed", bExpectedResult, bActualResult);
}
@Test
public void testisOdd2(){
	int iIntegerTestValue = 6;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedResult = false;
	boolean bActualResult = instance.isEven();
	assertEquals("testisEven() failed", bExpectedResult, bActualResult);
}
@Test
public void testisPrime(){
	int iIntegerTestValue = 6;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedResult = false;
	boolean bActualResult = instance.isEven();
	assertEquals("testisEven() failed", bExpectedResult, bActualResult);
}

@Test
public void testisPrime2(){
	int iIntegerTestValue = 13;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedResult = true;
	boolean bActualResult = instance.isEven();
	assertEquals("testisEven() failed", bExpectedResult, bActualResult);
}
	@Test
	public void testequals(){
		int iIntegerTestValue = 13;
		MyInteger instance = new MyInteger(iIntegerTestValue);
		boolean bExpectedResult = true;
		boolean bActualResult = instance.equals(13);
		assertEquals("testisEven() failed", bExpectedResult, bActualResult);}
@Test
public void testequals2(){
	int iIntegerTestValue = 13;
	MyInteger instance = new MyInteger(iIntegerTestValue);
	boolean bExpectedResult = false;
	boolean bActualResult = instance.equals(10);
	assertEquals("testisEven() failed", bExpectedResult, bActualResult);
}}
