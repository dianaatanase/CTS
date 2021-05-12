package ro.ase.csie.cts.seminar11.adapterCont;

public class ContBancarDebit implements ContBancar {

	double balanta;
	String IBAN;
	 
	
	
	public ContBancarDebit(double balamta, String iBAN) {
		super();
		this.balanta = balamta;
		IBAN = iBAN;
	}

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		destinatie.depune(suma);
		this.balanta -=suma;
	}

	@Override
	public void depune(double suma) {
		this.balanta +=suma;
	}

}
