package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class VekslePenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tallTxt = showInputDialog("Oppgi pris");
		int pris = parseInt(tallTxt);
		String tallTxt2 = showInputDialog("Oppgi beløp");
		int beløp = parseInt(tallTxt2);
		
		int veksel = beløp - pris;
		int ant10kr = veksel/10;
		int ant1kr = veksel%10;
		
		String ut = "Antall 10Kr: " + ant10kr + "\n" +
					"Antall 1kr: " + ant1kr;  
				showMessageDialog(null, ut);
	}

}
