package oblig1;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgO3 {

	public static void main(String[] args) {
		int n = parseInt(showInputDialog("n!"));
		double sum = 1;
		while (n > 1) {
			sum *= n; 
			n -= 1;
		}
		System.out.println(sum);
	}

}