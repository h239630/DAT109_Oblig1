package no.hvl.dat109Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import no.hvl.dat109.Terning;

public class TestKlasse {
	
	@Test
	public void terningGirVerdi() {
		Terning terning = new Terning();
		terning.trill();
		
		assertTrue(terning.getVerdi() > 0);
	}

}
