package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auto_radnja.gume.AutoGuma;

class VulkanizerskaRadnjaTest extends RadnjaTest{
	
	@BeforeEach
	void setUp() throws Exception {
		radnja = new VulkanizerskaRadnja();
	}

	@AfterEach
	void tearDown() throws Exception {
		radnja = null;
	}

	/*protected Radnja radnja;

	@Test
	void testDodajGumuNull() {
		assertThrows(java.lang.NullPointerException.class,()->radnja.dodajGumu(null) );
		
	}
	
	@Test
	void testDodadjGumu() {
		AutoGuma ag=new AutoGuma("Continental", 17, 255, 40);
		radnja.dodajGumu(ag);
		assertEquals(1, radnja.pronadjiGumu("Continental").size());
	}
	
	
	@Test
	void testDodajGumuDuplikat() {
		AutoGuma ag=new AutoGuma("Continental", 17, 255, 40);
		AutoGuma ag1=new AutoGuma("Continental", 17, 255, 40);
		radnja.dodajGumu(ag);
		RuntimeException e=assertThrows(java.lang.RuntimeException.class, ()->radnja.dodajGumu(ag1));
		assertEquals("Guma vec postoji", e.getMessage());
	}
	
	@Test
	void testPronadjiGumuNull() {
		assertThrows(java.lang.NullPointerException.class,()->radnja.dodajGumu(null) );
		
	}
	
	void testPronadjiGumu() {
		AutoGuma ag=new AutoGuma("Continental", 17, 255, 40);
		AutoGuma ag1=new AutoGuma("Continental", 20, 255, 40);
		radnja.dodajGumu(ag);
		LinkedList<AutoGuma> gume=new LinkedList<AutoGuma>();
		gume=radnja.pronadjiGumu("Continental");
		assertEquals(0, gume.size());
		
	}*/

}
