
public class Account {

	private String nbr;
	private Double balance;
	private Person owner;
	
	public String getNbr() {
		return nbr;
	}
	public void setNbr(String newNbr) {
		nbr = newNbr;
	}
	public Person getOwner() {
		return owner;
	}
	public void setOwner(Person newOwner) {
		owner = newOwner;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public double getBalance() {
		return balance;
	}
	public void credit(double amount) {
		balance = balance + amount;
	}
	public void withdraw(double amount) {
		balance = balance - amount;
	}
}
