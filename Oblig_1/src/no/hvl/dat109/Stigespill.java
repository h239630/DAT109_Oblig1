/**
 * 
 */
package no.hvl.dat109;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasse for å simulere en runde med stigespill
 * @author Mikael Lindebrekke & Joachim D. Nilsen
 */
public class Stigespill {
	
	private List<Spiller> spillere;
	private Brett brett;
	private Terning terning;
	
	/**
	 * Starter spillet med et gitt antall spillere
	 * @param antallSpiller
	 */
	public void startSpill(int antallSpiller) {
		boolean seier = false; 
		
		spillere = new ArrayList();
		//Må legge inn seier betingelse - En spiller som står i rute 100

		while(!seier) {
			spillRunde(); 
		}
	}
	
	/**
	 * Spiller en runde i stigespillet
	 */
	
	private void spillRunde() {
		
	}
}
