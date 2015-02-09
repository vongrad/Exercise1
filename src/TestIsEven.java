import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestIsEven {

	private TestEven instance;
	
	@Before
	public void setUp() throws Exception {
		instance = new TestEven();
	}

	@Test
	public void testEvenNegativeBound() {
		assertEquals(true, instance.isEven(-2));
	}
	
	@Test
	public void testEvenPositiveBound() {
		assertEquals(true, instance.isEven(2));
	}
	
	@Test
	public void testEvenPositiveRnd() {
		assertEquals(true, instance.isEven(100));
	}
	
	@Test
	public void testEvenNegativeRnd() {
		assertEquals(true, instance.isEven(-100));
	}
	
	@Test
	public void testnotEvenNegativeBound() {
		assertEquals(false, instance.isEven(-1));
	}
	
	@Test
	public void testnotEvenPositiveBound() {
		assertEquals(false, instance.isEven(1));
	}
	
	@Test
	public void testnotEvenPositiveRnd() {
		assertEquals(false, instance.isEven(99));
	}
	
	@Test
	public void testnotEvenNegativeRnd() {
		assertEquals(false, instance.isEven(-99));
	}
	
	@Test
	public void TestEvenBOundary() {
		assertEquals(true, instance.isEven(0));
	}

}
