package no.hvl.dat109;

public class Main {

	public static void main(String[] args) {

		Stigespill sp = new Stigespill();
		
		sp.settOppSpill(2);
		
		System.out.println("Starter opp stigespillet! \n-------------------------");
		
		sp.startSpill();
	}

}
