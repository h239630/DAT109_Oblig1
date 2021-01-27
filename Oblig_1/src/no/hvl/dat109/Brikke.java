/**
 * 
 */
package no.hvl.dat109;

/**
 * Klasse for å opprette en brikke
 * 
 * @author Mikael Lindebrekke & Joachim D. Nilsen
 */
public class Brikke {

	private Rute plassering;

	/**
	 * Konstruktør for å opprette en brikke
	 * 
	 */
	public Brikke(Brett brett) {
		plassering = brett.getRuter().get(0);
	}

	/**
	 * Flytter en brikke verdi antall plasser på brettet.
	 * 
	 * @param verdi
	 * @param brett
	 */

	public void flytt(int verdi, Brett brett) {
		int plassNr = plassering.getNummer() + verdi;
		plassering = brett.getRuter().get(plassNr);
	}

	/**
	 * Returnerer brikken sin nåværende plassering.
	 * 
	 * @return plassering
	 */
	public Rute getPlassering() {
		return plassering;
	}
}
