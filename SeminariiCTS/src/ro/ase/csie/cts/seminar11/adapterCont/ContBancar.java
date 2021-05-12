package ro.ase.csie.cts.seminar11.adapterCont;

public interface ContBancar {
	public void transfer(ContBancar destinatie, double suma);
	public void depune(double suma);
}
