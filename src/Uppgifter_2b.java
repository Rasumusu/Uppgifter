import java.util.Scanner;

public class Uppgifter_2b {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1;											//Deklarerar variabler
		int num2;
		
		do {												//Skapar do-while loop f�r repitition
		System.out.println("Skriv in det f�rsta talet: ");
		num1 = scanner.nextInt();
		
		
			if(num1 ==0)									//Loop ska avbrytas om f�rsta talet �r 0
				System.out.println("Tackar.");
			else if(num1 !=0) {
		
		System.out.println("Skriv in det andra talet: ");
		num2 = scanner.nextInt();
		

		if(num1>num2)
			System.out.println(num1 + " �r st�rre �n " + num2);
		else if(num2>num1)
			System.out.println(num2 + " �r st�rre �n "+num1);
		else
			System.out.println("Talen �r lika"); }
			}while(num1 !=0);								//Avbryt loop om f�rsta talet �r noll
		
		scanner.close();

}}