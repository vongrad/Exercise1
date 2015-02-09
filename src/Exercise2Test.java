import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class Exercise2Test {

	private Exercise2 exercise2;
	
	@Before
	public void setUp() throws Exception {
		exercise2 = new Exercise2(100);
	}

	@Test
	public void getBalanceCorrect() {
		assertEquals(100, exercise2.getBaance());
	}
	
	@Test
	public void getBalanceIncorrect() {
		assertNotEquals(99, exercise2.getBaance());
	}
	
	@Test
	public void testWithdrawCorrect() {
		assertTrue(exercise2.withdraw(100));
		assertEquals(0, exercise2.getBaance());
	}
	
	@Test
	public void testWithdrawIcorrect() {
		assertFalse(exercise2.withdraw(101));
		assertEquals(100, exercise2.getBaance());
	}
	
	@Test
	public void testDepositCorrect() {
		exercise2.deposit(10);
		assertEquals(110, exercise2.getBaance());
	}
	
	@Test
	public void testDepositIncorrect() {
		exercise2.deposit(10);
		assertNotEquals(111, exercise2.getBaance());
	}
	
	

}
