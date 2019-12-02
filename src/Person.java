import java.util.LinkedList;

public class Person {

	private String pNbr;
	private String name;
	
	private LinkedList <Account> harAccount;
	
	public String getName() {								//Setters och getters för namn
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public Person () {
		this.setHarAccount(new LinkedList<Account>());
	}
	
	public String getpNbr() {								//Setters och getters för personnummer
		return pNbr;
		
	}
	public void setpNbr(String newPnbr) {
		pNbr = newPnbr;
	}

	public LinkedList<Account> getHarAccount() {
		return harAccount;
	}
	
	public void setHarAccount(LinkedList<Account> newHarAccount) {
		harAccount = newHarAccount;
	}
	
	public void harAccount(Account a) {
		this.getHarAccount().add(a);
	}

	
}

