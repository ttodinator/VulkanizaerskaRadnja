package auto_radnja.gume;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AutoGumaTest {
	
	AutoGuma a;

	@BeforeEach
	void setUp() throws Exception {
		a=new AutoGuma();
	}

	@AfterEach
	void tearDown() throws Exception {
		a=null;
	}


	@Test
	void testAutoGuma() {
		a=new AutoGuma();
		
		assertNotNull(a);
	}

	@Test
	void testAutoGumaStringIntIntInt() {
		a=new AutoGuma("Michelin Pilot Sport 4", 18, 255, 60);
		assertNotNull(a);
		assertEquals("Michelin Pilot Sport 4", a.getMarkaModel());
		assertEquals(18, a.getPrecnik());
		assertEquals(255, a.getSirina());
		assertEquals(60, a.getVisina());
	}

	@Test
	void testSetMarkaModel() {
		a.setMarkaModel("Michelin Pilot Sport 4");
		assertNotNull(a);
	}
	
	@Test
	@DisplayName("Testira da li metoda setMarkaModel vraca pravu vrednost")
	void testSetMarkaModelVrednost() {
		a.setMarkaModel("Michelin Pilot Sport 4");
		assertEquals("Michelin Pilot Sport 4", a.getMarkaModel());
	}
	
	@Test
	@DisplayName("Testira ako je uneto null umesto imena")
	void testSetMarkaModelNull() {
		assertThrows(java.lang.NullPointerException.class, ()->a.setMarkaModel(null));
	}
	
	@Test
	@DisplayName("Testira ako je unet string sa manje od 3 znaka")
	void testSetMarkaModelKratakString() {
		assertThrows(java.lang.RuntimeException.class, ()->a.setMarkaModel("pp"));
	}
	
	@Test
	@DisplayName("Testira da li je uneti int manji od 13")
	void testSetPrecnikVrednosDonjaGranica() {
		assertThrows(java.lang.RuntimeException.class, ()->a.setPrecnik(10));
	}
	
	@Test
	@DisplayName("Testira da li je uneti int veci od 22")
	void testSetPrecnikVrednosGornjaGranica() {
		assertThrows(java.lang.RuntimeException.class, ()->a.setPrecnik(23));
	}

	@ParameterizedTest
	@CsvSource({
		"13",
		"15",
		"18"
	})
	
	void testSetPrecnik(int precnik1) {
		a.setPrecnik(precnik1);
		assertEquals(precnik1, a.getPrecnik());
	}

	@Test
	@DisplayName("Testira da li je uneta sirina veca od 355")
	void testSetSirinaGornjaGranica() {
		assertThrows(java.lang.RuntimeException.class, ()->a.setPrecnik(356));
	}
	
	@Test
	@DisplayName("Testira da li je uneta sirina manja od 135")
	void testSetSirinaDonjaGranica() {
		assertThrows(java.lang.RuntimeException.class, ()->a.setPrecnik(134));
	}
	
	@ParameterizedTest
	@CsvSource({
		"222",
		"189",
		"350"
	})
	void testSetSirina(int sirina1) {
		a.setSirina(sirina1);
		assertEquals(sirina1, a.getSirina());
	}
	
	@Test
	@DisplayName("Testira da li je uneta visina veca od 95")
	void testSetVisinaGornjaGranica() {
		assertThrows(java.lang.RuntimeException.class, ()->a.setSirina(96));
	}
	
	@Test
	@DisplayName("Testira da li je uneta visina vmanja od 25")
	void testSetVisinaDonjaGranica() {
		assertThrows(java.lang.RuntimeException.class, ()->a.setSirina(24));
	}

	@ParameterizedTest
	@CsvSource({
		"34",
		"45",
		"87"
	})
	void testSetVisina(int visina1) {
		a.setVisina(visina1);
		assertEquals(visina1, a.getVisina());
	}

	@Test
	void testToString() {
		a.setMarkaModel("Continental 4");
		a.setPrecnik(17);
		a.setSirina(300);
		a.setVisina(45);
		String s=a.toString();
		assertTrue(s.contains("Continental 4"));
		assertTrue(s.contains("17"));
		assertTrue(s.contains("300"));
		assertTrue(s.contains("45"));
	}

	@Test
	void testEqualsObject() {
		a.setMarkaModel("Continental 4");
		a.setPrecnik(16);
		a.setSirina(255);
		a.setVisina(40);
		
		AutoGuma b=new AutoGuma("Continental 4", 16, 255, 40);
		assertEquals(true,a.equals(b));
	}

}
