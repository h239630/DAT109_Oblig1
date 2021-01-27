/**
 * 
 */
package no.hvl.dat109;

/**
 * Klasse for å opprette en terning
 * @author Mikael Lindebrekke & Joachim D. Nilsen
 */
public class Terning {
	
	private int verdi;

	/**
	 * Oppretter en terning som ikke har verdi enda. 
	 */
	public Terning() {
		
	}

	/**
	 * @return the verdi
	 */
	public int getVerdi() {
		return verdi;
	} 
	
	public void trill() {
		verdi = (int) (Math.random() * 6) + 1;
	}
}
