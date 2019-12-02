import java.util.Scanner;

public class Uppgift_4_c {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);									//Skapar scanner f�r inmatning
		
		while(true) {																//G�r en o�ndlig loop
			System.out.print("Ins�ttning eller uttag (0-ins�ttning, 1-uttag): ");	
			double inut = scanner.nextDouble();
			
			System.out.print("Ange belopp: ");
			
			if(inut == 0)															//g�r if-sats ang�ende ins�ttning/uttag
				Bankkonto.ins�ttning(scanner.nextDouble());
			
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
