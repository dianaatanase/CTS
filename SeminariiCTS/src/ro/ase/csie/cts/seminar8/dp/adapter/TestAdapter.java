package ro.ase.csie.cts.seminar8.dp.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {
		
		CaracterFantastic dragon = new CaracterFantastic("Dragonul verde", 1000);
		dragon.seDeplaseaza();
		dragon.esteLovit(300);
		dragon.seVindeca(400);
		
		DonaldDuck donald = new DonaldDuck();
		donald.setPower(500);
		donald.move(100, 100);
		donald.primesteLovitura(50);
		donald.reincarca(100);

		ArrayList<ACMECaracterJoc> caractere = new ArrayList<>();
		caractere.add(dragon);
	}

}
