import java.util.Scanner;

public class Uppgift_3 {

	public static void main(String[] args) {
	int summa = 0;								//Deklarerar variabler
	double medelvarde = 0;
	int maxvarde = 0;
	int[] list = new int[5];
	
	Scanner scanner = new Scanner(System.in);
	
		System.out.println("Ange fem tal");
	


	for(int i= 0; i < 5; i++)					//Ber om 5 tal med hj�lp av for-loop
	{
	 System.out.print("Ange tal "+(i+1)+": ");
	 list[i]=scanner.nextInt();
	 
	}
	
	for (int i = 0; i<5; i++)					
	{
		summa +=list[i];						//Summa och medelv�rde ber�knas baserat p� inmatade v�rden
		medelvarde = (double)summa/5;
		
		if (i==0)								//F�rsta talet som matats in �r automatiskt maxv�rdet
			maxvarde = list[i];
		else if(list[i]>maxvarde)				//Alla efterf�ljande tal j�mf�rs med de i listan och uppdaterar variabeln om h�gre
			maxvarde = list[i];
	}
	
	System.out.println("Summan av talen �r: "+summa);
	System.out.println("Medelv�rdet av talen �r: "+medelvarde);
	System.out.println("Det h�gsta talet �r: "+maxvarde);

		scanner.close();

	}

	}

	


