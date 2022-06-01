import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

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
	public final void testadd() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		int a = 5632;
		int b = 3241;
		
		int actual = cal.add(a,b);
		
		int expected = 8873;
		
		assertEquals(actual,expected);
		
	}
	
	@Test
	public final void testSubtract() {
		//fail("Not yet implemented");
		
		Calculator cal = new Calculator();
		int a = 300;
		int b = 20;
		
		int actual = cal.substract(a, b);
		
		int expected = 280;
		
		assertEquals(actual,expected);
		
	}
	
	@Test
	public final void testMultiple() {
		//fail("Not yet implemented");
		
		Calculator cal = new Calculator();
		int a = 12;
		int b = 8;
		
		int actual = cal.multiple(a, b);
		
		int expected = 96;
		
		assertEquals(actual,expected);
		
	}
	
	@Test
	public final void testDivide() {
		//fail("Not yet implemented");
		
		Calculator cal = new Calculator();
		int a = 12;
		int b = 2;
		
		
		int actual = cal.divide(a, b);
		
		int expected = 6;
		assertEquals(actual,expected);
		
		
		
		
	}
	@Test
	public final void testDivideWith0Denominator() {
		//fail("Not yet implemented");
		
		Calculator cal = new Calculator();
		int a = 12;
		int c = 0;
		
		try {
			cal.divide(a,c);
			fail("Expected an IllegalArgumentException to be thrown");
		}catch(IllegalArgumentException e){
			assertEquals("Division by zero is not supported", e.getMessage());
		}catch(Throwable t) {
			assertEquals("Excepted an IllegalArgumentException to be thrown",t.getMessage());
		}
		
		
		
		
		
	}

}
