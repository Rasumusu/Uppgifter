import java.util.Scanner;

public class Uppgift_2a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1;												//Deklarerar variabler
		int num2;
		
	
		System.out.println("Skriv in det första talet: ");
		num1 = scanner.nextInt();
		
		System.out.println("Skriv in det andra talet: ");
		num2 = scanner.nextInt();
		
		if(num1>num2)												//Jämför tal med hjälp av if-sats
			System.out.println(num1 + " är större än " + num2);
		else if(num2>num1)
			System.out.println(num2 + " är större än "+num1);
		else
			System.out.println("Talen är lika"); 
			
		scanner.close();

}}