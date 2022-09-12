package oblig1;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgO2 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
		int inp = parseInt(showInputDialog("Poengsum"));
	
		if (inp >= 0 && inp <= 39)
			System.out.println("Elev " + i + ": karakter F");
		else if (inp >= 40 && inp <= 49)
			System.out.println("Elev " + i + ": karakter E");
		else if (inp >= 50 && inp <= 59)
			System.out.println("Elev " + i + ": karakter D");
		else if (inp >= 60 && inp <= 79)
			System.out.println("Elev " + i + ": karakter C");
		else if (inp >= 80 && inp <= 89)
			System.out.println("Elev " + i + ": karakter B");
		else if (inp >= 90 && inp <= 100)
			System.out.println("Elev " + i + ": karakter A");
		else {
			System.out.println("Ugyldig karakter");
			i --;
		}
		}
	}

}
