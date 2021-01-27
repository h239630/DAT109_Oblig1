/**
 * 
 */
package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å opprette brettet
 * 
 * @author Mikael Lindebrekke & Joachim D. Nilsen
 */
public class Brett {

	private List<Rute> ruter;

	/**
	 * Konstruktør for å opprette ett brett med en tom liste av ruter.
	 */
	public Brett() {
		ruter = new ArrayList<Rute>();

	}

	/**
	 * Legger til 100 ruter til brettet. 
	 */
	public void leggTilRuter() {
		for (int i = 0; i <= 106; i++) {
			ruter.add(new Rute(i));
		}
	}
	/**
	 * Returnerer en liste med alle ruter. 
	 * 
	 * @return ruter
	 */

	public List<Rute> getRuter() {
		return this.ruter;
	}

}
