package auto_radnja;

import java.util.LinkedList;

import auto_radnja.gume.AutoGuma;

/**
 * Interfejs koji predstavlja radnju
 * 
 * @author Petar Todic
 * 
 * @version 1.0
 *
 */
public interface Radnja {
	/**
	 * Dodaje novu automobilsku gumu u radnju
	 * 
	 * @param a Automobilska guma koja se dodaje
	 * 
	 * @throws java.lang.NullPointerException ako je uneta guma null
	 * @throws java.lang.RuntimeException ako je guma vec postoji u radnji
	 */
	void dodajGumu(AutoGuma a);
	
	/**
	 * Pronalazi i vraca listu objekata tipa AutoGuma koje imaju isti naziv (marku i model) kao i String parametar
	 * 
	 * @param markaModel AutoGuma preko cije vrednosti vrsimo pretragu
	 * @return LinkedList Vraca listu objekata tipa AutoGuma
	 */
	LinkedList<AutoGuma> pronadjiGumu(AutoGuma markaModel);

}
