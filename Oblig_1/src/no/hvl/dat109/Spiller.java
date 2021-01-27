/**
 * 
 */
package no.hvl.dat109;

/**
 * Klasse for � opprette en spiller
 * 
 * @author Mikael Lindebrekke & Joachim D. Nilsen
 */
public class Spiller {

	private String navn;
	private Brikke brikke;

	/**
	 * Oppretter en spiller med navn og gir spiller en ny brikkke.
	 * 
	 * @param navn
	 */
	public Spiller(String navn, Brikke brikke) {
		this.navn = navn;
		this.brikke = brikke;
	}

	/**
	 * Gj�re et trekk for en spiller med terning p� brettet.
	 * 
	 * @param terning
	 * @param brett
	 */
	public void spillTrekk(Terning terning, Brett brett) {
		System.out.println(navn + " sin tur.\n  Triller terning...");
		terning.trill();
		System.out.println("  Resultat: " + terning.getVerdi());
		brikke.flytt(terning.getVerdi(), brett);
		System.out.println("  Brikken er flyttet og st�r n� p� rute nr. " + brikke.getPlassering().getNummer());
	}

	/**
	 * Returnerer navnet til spilleren
	 * 
	 * @return navn
	 */
	public String getNavn() {
		return navn;
	}

	/**
	 * Returnerer brikken til spilleren
	 * 
	 * @return brikke
	 */
	public Brikke getBrikke() {
		return brikke;
	}

}
