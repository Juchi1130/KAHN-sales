package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {
	private List<BankAccountDBI> accounts;
	
	public Bank() {
		accounts = new ArrayList<>();
	}	
		
	public void add(BankAccountDBI a) {
		accounts.add(a);
	}
	
	public void clear() {
		accounts.clear();
	}

	public void remove(BankAccountDBI a) {
		accounts.remove(a);
	}

	public void remove(BankAccountDBI... acc) {
		for (BankAccountDBI a: acc) {
			remove(a);
		}
	}

	public void add(BankAccountDBI... acc) {
		for (BankAccountDBI a: acc) {
			add(a);
		}
	}
	
	public void addAll( List<BankAccountDBI> accountList ) {
		accounts.addAll( accountList );
	}
	
	public List<BankAccountDBI> getAccounts(){
		return Collections.unmodifiableList( accounts );
	}

	@Override
	public String toString() {
		return "Bank [accounts=" + accounts + "]";
	}
}
