package ro.ase.csie.cts.seminar8.dp.decorator;

import ro.ase.csie.cts.seminar8.dp.adapter.ACMECaracterJoc;

public class DecoratorRanit extends DecoratorCaracter{

	public DecoratorRanit(ACMECaracterJoc caracter) {
		super(caracter);
	}

	@Override
	public void seDeplaseaza() {
		if(this.caracter.getPuncteViata() < 100) {
			System.out.println("Nuse mai poate deplasa! e ranit critic.");
		} else 
			this.caracter.seDeplaseaza();
		
	}
	
	

}
