package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;



public class Trinnskatt {

	public static void main(String[] args) {
		String lønnTxt = showInputDialog("Oppgi Bruttolønn");
		int brutto = parseInt(lønnTxt);		
		double tSkatt;
		if ( brutto >= 164101 && brutto <= 230950)
			tSkatt = brutto * 0.0093; 					//trinn1
		else if (brutto >= 230951 && brutto <= 580650)
			tSkatt = brutto * 0.0241;					//trinn2
		else if (brutto >= 580651 && brutto <= 934050)
			tSkatt = brutto * 0.1152;					// trinn3
		else if(brutto >= 934051)							
			tSkatt = brutto * 0.1452; 					// trinn4
		else 
			tSkatt = 0;
		showMessageDialog(null, ("Trinnskatt= ") + (int)((tSkatt*100 +0.5) /100) + ("kr"));
				
			
			
	}

}
