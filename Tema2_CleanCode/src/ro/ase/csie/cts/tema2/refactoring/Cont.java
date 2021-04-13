package ro.ase.csie.cts.tema2.refactoring;

import ro.ase.csie.cts.tema2.exceptions.ConstructorInvalidException;
import ro.ase.csie.cts.tema2.exceptions.ValoareInvalidaException;

public class Cont implements RataAnuala {

	double valoareImprumut;
	int zileActiv;
	double rata;
	double rataLunara; 
	TipCont tipCont;
	
	public static final int ZILE_AN = 365;
	public static final double BROKER_FEE = 0.0125;

	public double getImprumut() {
		return valoareImprumut;
	}

	@Override
	public double getRataAnuala() {
		return rata;
	}
	
	public double getRataLunara() {
		return rataLunara = valoareImprumut * rata;
	}
	
	public void setValoareImprumut(double valoare) throws ValoareInvalidaException {
		if (valoare < 0) {
			throw new ValoareInvalidaException();
		} else {
			valoareImprumut = valoare;
		}
	}
	
	@Override
	public String toString() {
		return "Loan: " + this.valoareImprumut + "; rate: " + this.rata + "; days active:" + zileActiv + "; Type: "
				+ tipCont + ";";
	}

	public static double calculeazaComisionTotal(Cont[] conturi) {
		double comisionTotal = 0.0;
		Cont cont;
		for (int i = 0; i < conturi.length; i++) {
			cont = conturi[i]; 
			if (cont.tipCont == TipCont.PREMIUM || cont.tipCont == TipCont.SUPER_PREMIUM){
				double dobandaPrincipala = cont.valoareImprumut * Math.pow(cont.rata, (cont.zileActiv / ZILE_AN));
				comisionTotal += BROKER_FEE * (dobandaPrincipala - cont.valoareImprumut); 
			}
		}
		return comisionTotal;
	}

	public Cont(double valoare, double rata, TipCont tipCont) throws ConstructorInvalidException {
		try {
			setValoareImprumut(valoare);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.rata = rata;
		this.tipCont = tipCont; 
	}
}
