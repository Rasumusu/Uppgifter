import java.util.Scanner;

public class Uppgifter_2b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1;											//Deklarerar variabler
		int num2;
		
		do {												//Skapar do-while loop för repitition
		System.out.println("Skriv in det första talet: ");
		num1 = scanner.nextInt();
		
		
			if(num1 ==0)									//Loop ska avbrytas om första talet är 0
				System.out.println("Tackar.");
			else if(num1 !=0) {
		
		System.out.println("Skriv in det andra talet: ");
		num2 = scanner.nextInt();
		

		if(num1>num2)
			System.out.println(num1 + " är större än " + num2);
		else if(num2>num1)
			System.out.println(num2 + " är större än "+num1);
		else
			System.out.println("Talen är lika"); }
			}while(num1 !=0);								//Avbryt loop om första talet är noll
		
		scanner.close();

}}