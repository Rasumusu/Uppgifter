import java.util.Scanner;

public class Uppgift_2a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1;												//Deklarerar variabler
		int num2;
		
	
		System.out.println("Skriv in det f�rsta talet: ");
		num1 = scanner.nextInt();
		
		System.out.println("Skriv in det andra talet: ");
		num2 = scanner.nextInt();
		
		if(num1>num2)												//J�mf�r tal med hj�lp av if-sats
			System.out.println(num1 + " �r st�rre �n " + num2);
		else if(num2>num1)
			System.out.println(num2 + " �r st�rre �n "+num1);
		else
			System.out.println("Talen �r lika"); 
			
		scanner.close();

}}