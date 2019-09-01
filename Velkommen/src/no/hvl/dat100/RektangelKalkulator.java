package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class RektangelKalkulator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tallTxt = showInputDialog("Oppgi lengden");
		int a = parseInt(tallTxt);
		String tallTxt2 = showInputDialog("Oppgi bredden");
		int b = parseInt(tallTxt2);
		int resultat = (a * b);
		String utTxt = "Arealet=  " +resultat; 
		showMessageDialog(null, utTxt);
	
		

	}

}
