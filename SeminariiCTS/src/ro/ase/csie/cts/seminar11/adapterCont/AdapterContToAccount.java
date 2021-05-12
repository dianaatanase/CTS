package ro.ase.csie.cts.seminar11.adapterCont;

public class AdapterContToAccount implements BankAccount{
	
	ContBancar cont;

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		ContBancarDebit contDebit = (ContBancarDebit) conversie(account);
		cont.transfer(contDebit, amount);
		
	}
	
	private ContBancar conversie(BankAccount account) {
		DebitAccount debit = (DebitAccount) account;
		ContBancarDebit cont = new ContBancarDebit(debit.value, debit.id+"");
		return cont;
	}

	public AdapterContToAccount(ContBancar cont) {
		super();
		this.cont = cont;
	}
	
	
	
}
