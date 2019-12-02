import java.util.LinkedList;

public class PersonRegister {
	String info;

	static LinkedList <Person> persons = new LinkedList<Person>();
	
	
	public Person findPerson(String pNbr) {
		for(Person tmp: persons) {
			if(tmp.getpNbr().equals(pNbr)) 
				return tmp;
				
		}
		return null;
	}
	
	public Person removePerson(String pNbr) {
		Person p = findPerson(pNbr);
				persons.remove(p);
				return null;
			}

	public LinkedList<Account> findPersonAccount(String pNbr) {
		Person g = findPerson(pNbr);
		return g.getHarAccount();
	}
	
	public void addPerson(Person p) {
		persons.add(p);
	}
	
	public LinkedList<Person> getPersons() {
		return persons;
	}
	
	public void setPersons(LinkedList <Person> newPersons) {
		persons = newPersons;
	}
	
}
