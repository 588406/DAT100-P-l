package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
public class Dato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String DagNr = showInputDialog("Oppgi dagnummer");
String MånedNr = showInputDialog("Oppgi måned nummer");
String ÅrsTall = showInputDialog("Oppgi årstall");

int dag = parseInt(DagNr);
int måned = parseInt(MånedNr);
int år = parseInt(ÅrsTall);

String utTxt = ("Dato ="+ (dag + (".") + måned + "." + ÅrsTall));
showMessageDialog(null, utTxt);
	}

}
