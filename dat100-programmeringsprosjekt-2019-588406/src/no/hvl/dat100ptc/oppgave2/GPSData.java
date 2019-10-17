package no.hvl.dat100ptc.oppgave2;

import static java.lang.Double.parseDouble;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpspoints;
	protected int antall = 0;

	public GPSData(int n) {
		antall = 0;
		gpspoints = new GPSPoint[n];
		
	}

	public GPSPoint[] getGPSPoints() {
		return this.gpspoints;
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		boolean inserted = false;
		
			if (antall < gpspoints.length) {
				gpspoints[antall] = gpspoint;
				antall ++;
				inserted = true;
			}
				
		return inserted;
	}

	public boolean insert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		GPSPoint gpspoint;
		int time = GPSDataConverter.toSeconds(timeStr);
		double latitude = parseDouble(latitudeStr); 	
		double longitude = parseDouble(longitudeStr); 
		double elevation = parseDouble(elevationStr);
		
		gpspoint =  new GPSPoint(time , latitude, longitude, elevation);
		
		boolean inserted = insertGPS(gpspoint);
		
		return inserted;
		
	}

	public void print() {

		System.out.println("====== Konvertert GPS Data - START ======");

		for(int i = 0; i < gpspoints.length; i++)
			System.out.print(gpspoints[i].toString());
		
		System.out.println("====== Konvertert GPS Data - SLUTT ======");

	}
}
