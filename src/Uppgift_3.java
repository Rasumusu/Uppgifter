import java.util.Scanner;

public class Uppgift_3 {

	public static void main(String[] args) {
	int summa = 0;								//Deklarerar variabler
	double medelvarde = 0;
	int maxvarde = 0;
	int[] list = new int[5];
	
	Scanner scanner = new Scanner(System.in);
	
		System.out.println("Ange fem tal");
	


	for(int i= 0; i < 5; i++)					//Ber om 5 tal med hjälp av for-loop
	{
	 System.out.print("Ange tal "+(i+1)+": ");
	 list[i]=scanner.nextInt();
	 
	}
	
	for (int i = 0; i<5; i++)					
	{
		summa +=list[i];						//Summa och medelvärde beräknas baserat på inmatade värden
		medelvarde = (double)summa/5;
		
		if (i==0)								//Första talet som matats in är automatiskt maxvärdet
			maxvarde = list[i];
		else if(list[i]>maxvarde)				//Alla efterföljande tal jämförs med de i listan och uppdaterar variabeln om högre
			maxvarde = list[i];
	}
	
	System.out.println("Summan av talen är: "+summa);
	System.out.println("Medelvärdet av talen är: "+medelvarde);
	System.out.println("Det högsta talet är: "+maxvarde);

		scanner.close();

	}

	}

	


