package ro.ase.csie.cts.tema2.refactoring;

public enum TipCont {
	
	STANDARD(0),
	BUGET(1),
	PREMIUM(2),
	SUPER_PREMIUM(3);
	
	protected int tip;

	TipCont(int tip){
		this.tip = tip;
	}
	
	public int getTipCont() {
		return tip;
	}
}
