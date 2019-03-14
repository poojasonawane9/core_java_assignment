package tests;
import org.junit.Test;
import main.Triangle;
import static org.junit.Assert.*;

public class TriangleTest{

	@Test
	public void findRightAngle(){
		Triangle triangle = new Triangle(3,4,5);
		assertTrue(triangle.isRightAngle());
	}

	@Test
	public void checkTriangleIsScalene(){
		Triangle triangle = new Triangle(5,6,8);
		assertTrue(triangle.isScalene());
	}
	
	@Test
	public void checkTriangleIsIsosceles(){
		Triangle triangle = new Triangle(5,6,5);
		assertTrue(triangle.isIsosceles());
	}
	@Test
	public void CheckTriangleIsEquilateral(){
		Triangle triangle = new Triangle(5,5,5);
		assertTrue(triangle.isEquilateral());
	}

}