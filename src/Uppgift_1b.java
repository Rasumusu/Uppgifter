import java.text.DecimalFormat;
import java.util.Scanner;

public class Uppgift_1b {

	public static void main(String[] args) {
		
		String namn;										//Definerar Strings och Doubles
		Double timlön;
		Double timmar;
		DecimalFormat df = new DecimalFormat("0.00");		//Skapar nytt decimal-format
		
		Scanner scanner = new Scanner(System.in);			//Ny scanner döpt "scanner"
		
		System.out.println("Ange ditt namn:");				//Uppmanar till inmatning
		namn = scanner.nextLine();							//Inmatning till tidigare skapad String
		
		System.out.println("Ange din timlön:");
		timlön = scanner.nextDouble();						//Inmatning till tidigare Double
		
		System.out.println("Ange antalet arbetade timmar:");
		timmar = scanner.nextDouble();
		
		String lön = df.format(timlön*timmar);				//Ny string med korrekt deciaml-format
		
		String fickjaghadettaisysout = namn.toUpperCase() + " du tjänade "+ lön + " kr förra veckan"; 	//Osäker på vad ni menade med inga meddelanden i sysout
		
		System.out.println(fickjaghadettaisysout);			//resultat
		
		scanner.close();									//Stänger scanner för att spara minne
		
		

	}

}
