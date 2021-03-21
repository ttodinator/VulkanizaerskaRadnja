package auto_radnja.gume;

/**
 * Klasa koja opisuje automobilsku gumu
 * 
 * Guma im svoju marku i model(markaModel) kao jednu string vrednost
 * Guma ima precnik, visinu i sirinu kao int vrednosti
 * 
 * @author Petar Todic
 * 
 * @version 1.0 
 *
 */

public class AutoGuma {
	/**
	 * Marka i model gume kao jedan String
	 */
	private String  markaModel=null;
	/**
	 * Precnik gume kao int vrednost
	 * @throws
	 */
	private int precnik=-1;
	/**
	 * Sirina gume kao int vrednost
	 */
	private int sirina=-1;
	/**
	 * Visina gume kao int vrednost
	 */
	private int visina=-1;
	
	/**
	 * Konsstrutkor koji inicijalizuje objekat i nista vise
	 */
	public AutoGuma() {
		
	}
	
	/**
	 * Konstruktor koji incijalizuje objekat i postavlja vrednosti za maru i model, precnik, sirinu i visinu gume
	 * 
	 * @param markaModel Marka i model gume kao jedna String vrednost
	 * @param precnik Precnik gume kao int vrednost
	 * @param sirina Sirina gume kao int vrednost
	 * @param visina Visina gume kao int vrednost
	 */
	
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		this.markaModel = markaModel;
		this.precnik = precnik;
		this.sirina = sirina;
		this.visina = visina;
	}

	/**
	 * Vraca marku i model gume 
	 * 
	 * @return markaModel koa String
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja markaModel na novu vrednost
	 * 
	 * @param markaModel
	 * 
	 * @throws java.lang.NullPointerException ako je uneta markaModel null
	 * @throws java.lang.RuntimeException ako je uneta markaModel kraca od 3 znaka
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length()<3)
			throw new RuntimeException("Marka i model moraju sadrzati bar 3 znaka");this.markaModel = markaModel;
	}

	/**
	 * Vraca precnik gume
	 * 
	 * @return precnik kao int
	 */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Postavlja precnik gume na novu vrednost
	 * 
	 * 
	 * @param precnik
	 * 
	 * throws java.lang.RuntimException ako je unet prcnik manji od 13 ili veci od 22
	 */

	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu gume
	 * 
	 * @return sirina kao int vrednost
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja sirinu gume na novu vrednost
	 * 
	 * @param sirina
	 * 
	 * @throws java.lang.RuntimeException ako je uneta sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	
	/**
	 * Vraca visinu gume
	 * 
	 * @return visina kao int vrednost
	 */

	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja visinu gume na novu vrednost
	 * 
	 * @param visina
	 * 
	 * @throws java.lang.RuntimeException ako je uneta visina manje od 25 ili veca do 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	
	/**
	 * Vraca String sa svim podacima o gumi
	 */

	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Vraca hashCode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((markaModel == null) ? 0 : markaModel.hashCode());
		result = prime * result + precnik;
		result = prime * result + sirina;
		result = prime * result + visina;
		return result;
	}
	
	/**
	 * Poredi dve gume i vraca true ako su iste,a false ako nisu
	 * 
	 * Gume se porede po marki i modelu, precniku, sirini i visini i sve cetiri vrednosti moraju da budu iste
	 * 
	 * @return
	 * <ul>
	 * 		<li>true ako oba objektna klase AutoGuma imaju istu moarku i mode, precnik, sirinu i visinu</li>
	 * 		<li>false u ostalim slucajevima</li>
	 * </ul>
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
	
	
	
	
	
	

}
