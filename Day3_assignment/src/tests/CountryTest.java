package tests;
import org.junit.Test;
import main.Country;
import static org.junit.Assert.*;
import org.junit.Before;

public class CountryTest{

	Country country[];

	@Before	
	public void setUp(){
	country = new Country[3];
	
	country[0] = new Country("India",21236,5869);
	country[1] = new Country("UK",24236,9869);
	country[2] = new Country("US",25236,1869);
	}
	@Test
	public void testLargestArea(){
		Country expectedCountry = new Country("UK",24236,9869);
		Country actualCountry = new Country().largestArea(country);
		assertEquals(expectedCountry.getCountryName(),actualCountry.getCountryName());
	}
	@Test
	public void testLargestPopulation(){
		Country expectedPopulation = new Country("US",25236,1869);
		Country actualPopulation = new Country().largestPopulation(country);
		assertEquals(expectedPopulation.getPopulation(),actualPopulation.getPopulation());
	}
	@Test
	public void testLargestPopulationDensity(){
		Country expectedCountryDensity = new Country("US",25236,1869);
		Country actualCountryDensity = new Country().largestPopulationDensity(country);
		assertEquals(expectedCountryDensity.getCountryName(),actualCountryDensity.getCountryName());
	}		
}