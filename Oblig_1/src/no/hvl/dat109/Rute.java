/**
 * 
 */
package no.hvl.dat109;

/**
 * Klasse for å opprette en rute til brettet.
 * 
 * @author Mikael Lindebrekke & Joachim D. Nilsen
 */
public class Rute {

	private int nummer;

	/**
	 * Konstruktør for å opprette en rute
	 * 
	 * @param nr
	 */

	public Rute(int nr) {
		this.nummer = nr;
	}

	/**
	 * Returnerer ruten sitt nummer.
	 * 
	 * @return nummer
	 */
	public int getNummer() {
		return nummer;
	}
}
