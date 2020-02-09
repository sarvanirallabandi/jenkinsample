import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyClassTest {

	@Test
	void test() {
		assertEquals(50, (10*5));
		System.out.println("here");
		assertNull(null, "null");
	}
	
	@Test
	void exceptionTesting() {
	    // set up user
		
	    Throwable exception = assertThrows(IllegalArgumentException.class,()->set());
	    assertEquals("Age must be an Integer.", exception.getMessage());
	}

	private Object set() throws Exception {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException("Age must be an Integer.");
	}

}
