import java.util.LinkedList;

import javax.swing.JFrame;

public class Controller {
	PersonRegister register = new PersonRegister();
	Person p = new Person();
	Account acc; 
	JFrame customerFrame;

	public void addPerson(String name, String pNbr, Person p) {
		register.addPerson(p);
		p.setName(name);
		p.setpNbr(pNbr);
	}

	public Person removePerson(String pNbr) {
		return register.removePerson(pNbr);
	}
	
	public Person findPerson(String pNbr) {
		return register.findPerson(pNbr); 
	}
	public void addAccount(Account a, Person p, String Nbr){
		p.harAccount(a);
		a.setOwner(p);
		a.setNbr(Nbr);
	}
	
	public LinkedList<Account> findOwnersAccounts (String pNbr) {
		return register.findOwnersAccount(pNbr);
	}
	
	
}



	
	
	

