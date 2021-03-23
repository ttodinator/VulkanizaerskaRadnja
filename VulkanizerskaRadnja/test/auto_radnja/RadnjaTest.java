package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import auto_radnja.gume.AutoGuma;

public abstract class RadnjaTest{

	protected Radnja radnja;
	
	@Test
	void testDodajGumuNull() {
		assertThrows(java.lang.NullPointerException.class,()->radnja.dodajGumu(null) );
		
	}
	
	@Test
	void testDodadjGumu() {
		AutoGuma ag=new AutoGuma("Continental", 17, 255, 40);
		radnja.dodajGumu(ag);
		assertEquals(1, radnja.pronadjiGumu("Continental").size());
		assertEquals(ag, radnja.pronadjiGumu("Continental").get(0));
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
		LinkedList<AutoGuma> gume=radnja.pronadjiGumu(null);
		assertNull(gume);
	}
	
	@Test
	void testPronadjiGumuNemaGume() {
		AutoGuma ag=new AutoGuma("Continental", 17, 255, 40);
		radnja.dodajGumu(ag);
		LinkedList<AutoGuma> gume=radnja.pronadjiGumu("Continental1");
		assertEquals(0, gume.size());
		
	}
	
	@Test
	void testPronadjiGumuIatoImeRazliciteDimenzije() {
		AutoGuma ag1=new AutoGuma("Continental", 17, 255, 40);
		AutoGuma ag2=new AutoGuma("Continental", 18, 200, 42);
		AutoGuma ag3=new AutoGuma("Continental", 19, 300, 46);
		radnja.dodajGumu(ag1);
		radnja.dodajGumu(ag2);
		radnja.dodajGumu(ag3);
		LinkedList<AutoGuma> gume=radnja.pronadjiGumu("Continental");
		assertEquals(3, gume.size());
		assertEquals(ag1, radnja.pronadjiGumu("Continental").get(2));
		assertEquals(ag2, radnja.pronadjiGumu("Continental").get(1));
		assertEquals(ag3, radnja.pronadjiGumu("Continental").get(0));
	}
	
	@Test
	void PronadjiGumu() {
		AutoGuma ag1=new AutoGuma("Continental", 19, 300, 46);
		radnja.dodajGumu(ag1);
		AutoGuma ag2=new AutoGuma("Continental1", 19, 300, 46);
		radnja.dodajGumu(ag2);
		assertEquals(1, radnja.pronadjiGumu("Continental").size());
		assertEquals(ag1, radnja.pronadjiGumu("Continental").get(0));
		
	}
	
	



}
