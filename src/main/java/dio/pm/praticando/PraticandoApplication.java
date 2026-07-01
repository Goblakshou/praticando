package main.java.dio.pm.praticando;

import main.java.dio.pm.praticando.domain.BRLClock;
import main.java.dio.pm.praticando.domain.Clock;
import main.java.dio.pm.praticando.domain.USClock;

public class PraticandoApplication {

	public static void main(String[] args) {
		BRLClock brlClock = new BRLClock(13, 25, 7);
		USClock usClock = new USClock(15, 41, 10);
		brlClock.calculateTime(brlClock);
		usClock.calculateTime(usClock);

		System.out.println(brlClock.printClock());
		System.out.println(usClock.printClock());

	}

}
