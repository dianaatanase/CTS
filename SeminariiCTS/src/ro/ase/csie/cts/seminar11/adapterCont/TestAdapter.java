package ro.ase.csie.cts.seminar11.adapterCont;

public class TestAdapter {

	public static void main(String[] args) {
		
		ContBancarDebit cont = new ContBancarDebit(100, "RO12");
		BankAccount account = new AdapterContToAccount(cont);
		account.accountTransfer(new DebitAccount(), 50);
		
		System.out.println("Valoare in cont: " + cont.balanta);

	}

}
