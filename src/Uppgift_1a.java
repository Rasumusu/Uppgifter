import java.util.Scanner;

public class Uppgift_1a {

	public static void main(String[] args) {
		
		String ord1;										//Definierar tv� Strings
		String ord2;
		
		Scanner scanner = new Scanner(System.in);			//Skapar ny scanner med namnet scanner
		
		System.out.println("Skriv ett ord:"); 				//Uppmanande till inmatning
		ord1 = scanner.nextLine();							//Inmatning = tidigare definierade strings
		System.out.println("Skriv ytterligare ett ord:");
		ord2 = scanner.nextLine();
		
		String konkat = ord1 + " " + ord2;					//Konkatenerar inmatade strings med ett mellanrum
				
		System.out.println(konkat);							//resultat
		System.out.println(konkat.length());				//antal bokst�ver
		
		scanner.close();									//St�nger scanner f�r att spara minne

	}

}
