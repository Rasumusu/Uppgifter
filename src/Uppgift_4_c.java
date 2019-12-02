import java.util.Scanner;

public class Uppgift_4_c {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);									//Skapar scanner för inmatning
		
		while(true) {																//Gör en oändlig loop
			System.out.print("Insättning eller uttag (0-insättning, 1-uttag): ");	
			double inut = scanner.nextDouble();
			
			System.out.print("Ange belopp: ");
			
			if(inut == 0)															//gör if-sats angående insättning/uttag
				Bankkonto.insättning(scanner.nextDouble());
			
			else if( inut == 1)
				Bankkonto.uttag(scanner.nextDouble());
			
			System.out.println("Saldo: " + Bankkonto.getSaldo());					//Printar saldo
			
			System.out.print("\nVill du avsluta?");			
			
			if(scanner.next().equals("J")) {
				System.out.println("Saldo: " + Bankkonto.getSaldo());
				break;																//Avbryter loop med break om de svarar med ett stort "J"
			}	
			
	}
		scanner.close();
	}}
