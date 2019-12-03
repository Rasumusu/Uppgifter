import javax.swing.JFrame;

public class Controller {
	PersonRegister reg = new PersonRegister();
	Person p = new Person();
	Account acc; 
	JFrame customerFrame;

	public void addPerson(String name, String pNbr, Person p) {
		reg.addPerson(p);
		p.setName(name);
		p.setpNbr(pNbr);
	}

	public Person removePerson(String pNbr) {
		return reg.removePerson(pNbr);
	}
	
	public Person findPerson(String pNbr) {
		return reg.findPerson(pNbr); 
	}
	public void addAccount(Account a, Person p, String Nbr){
		p.harAccount(a);
		a.setOwner(p);
		a.setNbr(Nbr);
	}
	

	
	
}



	
	
	

