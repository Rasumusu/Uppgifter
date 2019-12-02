import java.text.DecimalFormat;
import java.util.Scanner;

public class Uppgift_1b {

	public static void main(String[] args) {
		
		String namn;										//Definerar Strings och Doubles
		Double timl�n;
		Double timmar;
		DecimalFormat df = new DecimalFormat("0.00");		//Skapar nytt decimal-format
		
		Scanner scanner = new Scanner(System.in);			//Ny scanner d�pt "scanner"
		
		System.out.println("Ange ditt namn:");				//Uppmanar till inmatning
		namn = scanner.nextLine();							//Inmatning till tidigare skapad String
		
		System.out.println("Ange din timl�n:");
		timl�n = scanner.nextDouble();						//Inmatning till tidigare Double
		
		System.out.println("Ange antalet arbetade timmar:");
		timmar = scanner.nextDouble();
		
		String l�n = df.format(timl�n*timmar);				//Ny string med korrekt deciaml-format
		
		String fickjaghadettaisysout = namn.toUpperCase() + " du tj�nade "+ l�n + " kr f�rra veckan"; 	//Os�ker p� vad ni menade med inga meddelanden i sysout
		
		System.out.println(fickjaghadettaisysout);			//resultat
		
		scanner.close();									//St�nger scanner f�r att spara minne
		
		

	}

}
