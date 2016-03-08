package base;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TriangleTest {

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
	
	//Tests for the Area
	@Test
	public void testArea(){
		Triangle testTriangle = new Triangle(4.0,5.0,6.0);
		double trueValue = testTriangle.getArea();
		double testing = 9.921567416492215;
		assertEquals(trueValue == testing, true);
	}
	
	//Tests for the Perimeter
	@Test
	public void testPerimeter(){
		Triangle testTriangle = new Triangle(4.0,5.0,6.0);
		double trueValue = testTriangle.getPerimeter();
		double testing = 15.0;
		assertEquals(trueValue == testing, true);
	}
	
}
