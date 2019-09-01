package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class KarakterKalkulator {

	public static void main(String[] args) {
		
		
			
			for(int x=1; x<=10; x++)
			{String tallTxt = showInputDialog("Skriv inn poengsum:");
			int poengsum = parseInt(tallTxt);
			String karakter;
			
			switch ((100 >= poengsum && poengsum >= 90) ? 1 :
				(89 >= poengsum && poengsum >= 80) ? 2 :
					(79 >= poengsum && poengsum >= 60) ? 3 :
						(59 >= poengsum && poengsum >= 50) ? 4 :
							(49 >= poengsum && poengsum >= 40) ? 5 :
								(39 >= poengsum && poengsum >= 0) ? 6 : 7) {
				case 1 :
					karakter = "A"; break;
				case 2:
					karakter = "B"; break;
				case 3:
					karakter = "C"; break;
				case 4: 
					karakter = "D"; break;
				case 5: 
					karakter = "E"; break; 
				case 6:
					karakter = "F"; break;
				case 7:
				default: karakter = "Ugyldig";
					
			}
			showMessageDialog(null, karakter);
	
			}
	}
}
			