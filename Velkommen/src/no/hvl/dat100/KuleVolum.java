package no.hvl.dat100;

import static java.lang.Math.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;

public class KuleVolum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tallTxt = showInputDialog("Oppgi radius (cm)");
		double r = parseDouble(tallTxt);
		r = pow(r, 3);
		double y = 1.333333;
		double svar = (y * PI * r);
		svar = (int) (svar * 100 + 0.5) / 100.0;

		String utTxt = ("Volum=  ") + svar + (" kubikkcentimeter");
		showMessageDialog(null, utTxt);

	}

}
