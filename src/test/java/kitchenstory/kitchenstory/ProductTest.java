package kitchenstory.kitchenstory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import kitchenstory.kitchenstory.entity.Product;

public class ProductTest {
	private Product product;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("This is executed before all tests");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("This is executed after all tests");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("This is executed before each test case");
		product = new Product();
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

//	@Test
//	void testIfAddMethodReturnsZero() {
//		System.out.println("testIfAddMethodReturnsZero");
//		assertEquals(0, calculator.add(0, 0));
//	}
//	
//	@Test
//	void testIfAddMethodDoesNotReturnZero() {
//		System.out.println("testIfAddMethodDoesNotReturnZero");
//		assertNotEquals(0, calculator.add(12, 34));
//	}
//	
//	@Disabled("No repetition required")
//	@DisplayName("Add operation test")
//    @RepeatedTest(5)
//    void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
//        System.out.println("Running test : " + repetitionInfo.getCurrentRepetition());
//        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
//    }
//	
//	@Test
//	void testExpectedException() {
//	  //First argument - specifies the expected exception. 
//	  //Here it expects that code block will throw NumberFormatException
//	  //Second argument - is used to pass an executable code block or lambda expression 
//	  assertThrows(NumberFormatException.class, () -> {
//	    Integer.parseInt(calculator.acceptNumber());
//	  });
//	 
//	}

}
