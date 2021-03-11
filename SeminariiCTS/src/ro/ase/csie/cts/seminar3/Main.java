package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		
		Person p = new Person("Diana");
		BankAccount account = new BankAccount("INGB123242344", p);
		
		account.deposit(100);
		try {
			account.withdraw(30);
			account.withdraw(40);
			account.withdraw(70);

		} catch (InsuficientFundsException e) {
			System.out.println(e.getMessage());
		}
	

		Map<Person, BankAccount> employees = new HashMap<>();
		
		Person p1 = new Person("Ana Norris");
		BankAccount b1 = new BankAccount("RF12345678", p1);
		
		Person p2 = new Person("Archie Norris");
		BankAccount b2 = new BankAccount("BRD1234567", p2);
		
		Person p3 = new Person("Yogi");
		BankAccount b3 = new BankAccount("BEAR234567", p3);
		
		employees.put(p1,b1);
		
		System.out.println(account.getBalance());
		
	}

}