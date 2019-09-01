package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class MinsteTall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String tallTxt = showInputDialog("Gi tall nr.1");
String tallTxt2= showInputDialog("Gi tall nr.2");
String tallTxt3= showInputDialog("Gi tall nr.3");
String tallTxt4= showInputDialog("Gi tall nr.4");
	int a = parseInt(tallTxt);
	int b = parseInt(tallTxt2);
	int c = parseInt(tallTxt3);
	int d = parseInt(tallTxt4);
	int x = min(a, b);				
	int y = min (c, d);
	int svar = min(x, y);                  // min(a, b, c, d)
	String utTxt = ("svar= " + svar);
	showMessageDialog(null, utTxt);
	
	}

	}


