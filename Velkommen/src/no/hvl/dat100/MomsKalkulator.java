package no.hvl.dat100;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
public class MomsKalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String tallTxt = showInputDialog("Oppgi beløp"); 
	double beløp = parseDouble(tallTxt);
	
	double moms = beløp * 0.25;
	beløp = (int)(beløp*100 + 0.5) / 100.0;
	moms = (int)(moms*100 +0.5) / 100.0;
	
	String ut = "beløp: " + beløp + "kr" + "\n" +
				"moms: " + moms + "kr" + "\n" +
				"Pris(inkl. moms): " + (moms + beløp) + "kr";
	showMessageDialog(null, ut);
	
	}

}