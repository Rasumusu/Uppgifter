public class Bankkonto {

		private static String nummer;
		private static double saldo = 0;
	
	public static void insättning(double belopp) {
		saldo = saldo + belopp; }

	public static void uttag(double belopp) {
		saldo = saldo - belopp; }	
		
	private void setSaldo(double i) {
			saldo = i; }


	private static void setNummer(String string) {
			nummer = string; }


	private String getNummer() {
			return nummer; }


	public static double getSaldo() {
		return saldo; }
	
	
	
	//Testmetod
	public static void main(String[] args) {
		
		Bankkonto test = new Bankkonto();
		
		Bankkonto.setNummer("1234");
		
		System.out.println("Test "+ test.getNummer() + " " + Bankkonto.getSaldo());
		
		test.setSaldo(100);
		Bankkonto.setNummer("10");
		
		System.out.println("Test "+ test.getNummer() + " " + Bankkonto.getSaldo());
		
		Bankkonto.insättning(50);
		System.out.println("Test " + Bankkonto.getSaldo());
		Bankkonto.uttag(150);
		System.out.println("Test " + Bankkonto.getSaldo());
		
	}
}
