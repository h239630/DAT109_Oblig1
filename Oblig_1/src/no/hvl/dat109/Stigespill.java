/**
 * 
 */
package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å simulere en runde med stigespill
 * 
 * @author Mikael Lindebrekke & Joachim D. Nilsen
 */
public class Stigespill {

	private List<Spiller> spillere;
	private Brett brett;
	private Terning terning;
	
	/**
	 * Setter opp ett spill med ett gitt antall spillere. 
	 * 
	 * @param antallSpillere
	 */
	public void settOppSpill(int antallSpillere) {
		spillere = new ArrayList<Spiller>();
		terning = new Terning();
		brett = new Brett();
		brett.leggTilRuter();
		int nr = 1;

		for (int i = 0; i < antallSpillere; i++) {
			spillere.add(new Spiller("Spiller " + nr, new Brikke(brett)));
			nr++;
		}
	}

	/**
	 * Starter spillet med et gitt antall spillere
	 * 
	 * @param antallSpiller
	 */
	public void startSpill() {
		
		boolean seier = false;
		String vinner = "";

		// Må legge inn seier betingelse - En spiller som står i rute 100

		while (!seier) {
			spillRunde();
			
			for (int i = 0; i < spillere.size(); i++) {
				if (spillere.get(i).getBrikke().getPlassering().getNummer() >= 100) {
					seier = true;
					vinner = spillere.get(i).getNavn();
				}
			}
			
		}
		System.out.println("Vinneren av spillet er " + vinner);
	}

	/**
	 * Spiller en runde i stigespillet
	 */
	private void spillRunde() {
		for (Spiller spiller : spillere) {
			spiller.spillTrekk(terning, brett);
		}

	}
}
