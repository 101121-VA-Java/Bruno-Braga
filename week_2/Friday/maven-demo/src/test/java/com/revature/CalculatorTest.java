package com.revature;

import com.revature.exceptions.CalculatorException;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestMethodOrder(OrderAnnotation.class)
public class CalculatorTest {

	private static Calculator cal;

	/*
	 * JUnit Annotations: - @BeforeEach - - @AfterEach - @BeforeAll - @AfterAll
	 * - @Test - @Ignore - @Order
	 */

	@BeforeEach
	public void beforeEach() {
		System.out.println("Running before each test");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("Running after each test");
	}

	@BeforeAll
	public static void setup() {
		cal = new Calculator();
	}

	@AfterAll
	public static void tearDown() {
		System.out.println("AfterAll");
	}

	@Order(1)
	@Test
	public void addOneAndOne() {
		double expected = 2;
		double actual = cal.add(1, 1);
		assertEquals(expected, actual);
	}

	@Order(2)
	@Test
	public void addMinusTwoAndOne() {
		double expected = 1;
		double actual = cal.add(-2, 1);
		assertEquals(expected, actual);
	}

	@Order(3)
	@Test
	public void divideByZero() {
		assertThrows(CalculatorException.class, () -> cal.divide(1, 0));
	}

	@Order(4)
    @Test
    public void subtractFourAndOne() {
        double expected = 3;
        double actual = cal.subtract(4, 1);
        assertEquals(expected, actual);
	}

	@Order(5)
	@Test
	public void subtractTwoAndTwo() {
		double expected = 0;
		double actual = cal.subtract(2, 2);
		assertEquals(expected, actual);
	}
	
	@Order(6)
	@Test
	public void subtractTwoNegativesTwo () {
        double expected = -4;
        double actual = cal.subtract(-2, -2);
        assertEquals(expected, actual);
    }
	
	@Order(7)
    @Test
    public void isPrimeSix() {
        boolean expected = false;
        boolean actual = cal.isPrime(6);
        assertEquals(expected, actual);
    }
	
	@Order(8)
    @Test
    public void isPrimeSeven() {
        boolean expected = true;
        boolean actual = cal.isPrime(7);
        assertEquals(expected, actual);
    }
	
	@Order(9)
	@Test
	public void isPrimeThree() {
		boolean expected = true;
        boolean actual = cal.isPrime(3);
        assertEquals(expected, actual);
	}


}
