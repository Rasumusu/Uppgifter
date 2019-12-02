
public class Uppgift_5 {

	public static void main(String[] args) {
		
	
		
		Account one = new Account();	//Deklarerar konto 1
		one.setNbr("123");
		one.setBalance(69);
		one.credit(500);
		one.withdraw(47);
		
		
		Account two = new Account(); 	//Deklarerar konto 2
		two.setNbr("234");
		two.setBalance(567);
		two.credit(1000);
		two.withdraw(86);
		
		
		Person rasmus = new Person();	//Deklarerar första personen
		rasmus.harAccount(one);
		rasmus.harAccount(two);
		rasmus.setpNbr("123");
		rasmus.setName("Rasmus");
		one.setOwner(rasmus);
		two.setOwner(rasmus);
		
		
		
		Account three = new Account();	//Deklarerar konto 3
		three.setNbr("987");
		three.setBalance(8456);
		three.credit(765);
		three.withdraw(73);
		
		
		Account four = new Account();	//Deklarerar konto 4
		four.setNbr("6438");
		four.setBalance(632);
		four.credit(6437);
		four.withdraw(478);
		
		
		Person kajsa = new Person();	//Deklarerar andra personen
		kajsa.harAccount(three);
		kajsa.harAccount(four);	
		kajsa.setpNbr("3456789");
		kajsa.setName("Kajsa");
		three.setOwner(kajsa);
		four.setOwner(kajsa);
		
		PersonRegister reg = new PersonRegister();		//Lägger till personerna i PersonrRegister
		reg.addPerson(rasmus);
		reg.addPerson(kajsa);
		
		
		
		
		System.out.println("Personregistret innehåller personerna: ");				//Testar registret
			for (Person a: reg.getPersons()) {
			System.out.println(a.getName() + " med personnummer: " + a.getpNbr());
		}
	 	
		System.out.println(rasmus.getName() + " har kontona: ");						//Kollar konton för person ett
			for (Account p : rasmus.getHarAccount()) {
				System.out.println(p.getNbr() + " och har saldot: " + p.getBalance() );
			}
			
		System.out.println(kajsa.getName() + " har kontona: ");							//Kollar konto för person två
			for (Account p : kajsa.getHarAccount()) {
				System.out.println(p.getNbr() + " och har saldot: " + p.getBalance() );
			}
		
		
		System.out.println("Raderar person: " + rasmus.getName());						//Raderar person
		reg.removePerson(rasmus.getpNbr());
		

		System.out.println("Person registret innehåller personerna: ");					//Kontrollerar att det funkade att radera
		for (Person a: reg.getPersons()) {
			System.out.println(a.getName() + " med personnummer: " + a.getpNbr());
		}
		System.out.println(reg.findPerson("3456789"));
		
	
	}

}
