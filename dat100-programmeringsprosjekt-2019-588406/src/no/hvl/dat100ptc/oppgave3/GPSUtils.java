package no.hvl.dat100ptc.oppgave3;

import static java.lang.Math.*;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;
import no.hvl.dat100ptc.oppgave2.GPSDataConverter;
import java.util.Locale;

public class GPSUtils {

	public static double findMax(double[] da) {

		double max;

		max = da[0];

		for (double d : da) {
			if (d > max) {
				max = d;
			}
		}

		return max;
	}

	public static double findMin(double[] da) {

		double min;

		min = da[0];

		for (double d : da) {
			if (d < min) {
				min = d;
			}
		}
		return min;
	}

	public static double[] getLatitudes(GPSPoint[] gpspoints) {
		
		double[] breddeGrader = new double[gpspoints.length];
		int i = 0;
		
		for (int j = 0; j < gpspoints.length; j++) {
			breddeGrader[i] = gpspoints[j].getLatitude();
			i++;
		}
		return breddeGrader;
	}

	public static double[] getLongitudes(GPSPoint[] gpspoints) {

		double[] lengdeGrader = new double[gpspoints.length];
		int i = 0;
		
		for (int j = 0; j < gpspoints.length; j++) {
			lengdeGrader[i] = gpspoints[j].getLongitude();
			i++;
		}
		return lengdeGrader;

	}

	private static int R = 6371000; // jordens radius

	public static double distance(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		double d;
		double latitude1, longitude1, latitude2, longitude2;
		
		latitude1 = gpspoint1.getLatitude();	longitude1 = gpspoint1.getLongitude();
		latitude2 = gpspoint2.getLatitude();	longitude2 = gpspoint2.getLongitude();

		double rLatitude1 = toRadians(latitude1); 	double rLatitude2 = toRadians(latitude2);
		double rLongitude1 = toRadians(longitude1); double rLongitude2 = toRadians(longitude2);
		
		double deltaLatitude = rLatitude2 - rLatitude1;
		double deltaLongitude = rLongitude2 - rLongitude1;
		
		double a = pow((sin(deltaLatitude/2)),2) + cos(rLatitude1) * cos(rLatitude2) * 
					pow((sin(deltaLongitude/2)),2);
		double c = 2 * atan2(sqrt(a), sqrt(1-a));
		
		d = R * c;
		
		return d;      //meter
		
	}

	public static double speed(GPSPoint gpspoint1, GPSPoint gpspoint2) {

		int secs = gpspoint2.getTime() - gpspoint1.getTime();
		double timer = secs / 3600.0;
		
		double distance = distance(gpspoint1, gpspoint2);
		double km = distance/1000;
		
		double speed = km / timer;
		
		
		return speed;
	}

	public static String formatTime(int secs) {

		String timestr;
		String TIMESEP = ":";
		
		int hr = secs/ 3600;
		int rest = secs % 3600;
		int min =  rest / 60;
		int sec = secs % 60;
		
		String time = String.format("%02d", hr);
		String minutt =String.format("%02d", min);
		String sekund =String.format("%02d", sec);
		timestr = "  " + time + TIMESEP + minutt + TIMESEP + sekund;

	
		return timestr;

	}

	private static int TEXTWIDTH = 10;

	public static String formatDouble(double d) {

		String str;
		
		str = String.format(Locale.US, "%10.2f", d);

		return str;
}
}
