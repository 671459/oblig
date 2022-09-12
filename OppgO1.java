package oblig1;

import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.*;

public class OppgO1 {

	public static void main(String[] args) {
		double brutto = parseDouble(showInputDialog("Bruttoinntekt"));
		
		if (brutto <= 190349)
			System.out.println("Trinnskatt: 0%\n Skatt betalt: 0 nok");
		else if (brutto >= 190350 && brutto <= 267899)
			System.out.println("Trinnskatt: 1,7%\nSkatt betalt: " + (int)(brutto/1.7) + " nok");
		else if (brutto >= 267900 && brutto <= 643799)
			System.out.println("Trinnskatt: 4,0%\nSkatt betalt: " + (int)(brutto/4) + " nok");
		else if (brutto >= 643800 && brutto <= 969199)
			System.out.println("Trinnskatt: 13,4%\nSkatt betalt: " + (int)(brutto/13.4) + " nok");
		else if (brutto >= 969200 && brutto <= 1999999)
			System.out.println("Trinnskatt: 16,4%\nSkatt betalt: " + (int)(brutto/16.4) + " nok");
		else if (brutto >= 2000000)
			System.out.println("Trinnskatt: 17,4%\nSkatt betalt: " + (int)(brutto/17.4) + " nok");

	}

}
