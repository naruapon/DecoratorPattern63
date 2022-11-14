import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void testEspressSoyMilk() {
		Beverage b1 = new Espresso();
		b1 = new Soy(b1);
		b1 = new StreamedMilk(b1);
		assertEquals("Espresso, Soy, Streamed Milk",b1.getDescription());	
		assertEquals(2.24,b1.cost());
	}
	
	@Test
	void testHouseBlendMocha() {
		Beverage b2 = new HouseBlend();
		b2 = new Mocha(b2);
		assertEquals("House Blend, Mocha", b2.getDescription());
		assertEquals(1.09,b2.cost());
	}

}
