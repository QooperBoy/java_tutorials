
class Osoba{
	
	String imie;
	int wiek;
	
	
	
	// klasy przechowuj¹ 
	
	// 1. Dane
	// 2. Metody
	
	void speak() {
		for(int i=0; i<4; i++) {
		System.out.println("Elko " + imie + ", wa¿ê"+ wiek);
		
		}
	}
	
	int getage() {
		
		int yearsLeft = 65 - wiek;
		
		return yearsLeft;
		
	}
}


public class Klaski_Obiekty {

	public static void main(String[] args) {
	
		
		
		System.out.println("Hej");
		
		Osoba osoba1 = new Osoba();
		osoba1.imie = "Jan Kula";
		osoba1.wiek = 37;
		osoba1.speak();
		
		int years = osoba1.getage();
		System.out.println("Do emerytury zosta³o mi "+years+"lat");
				
		
		Osoba osoba2 = new Osoba();
		osoba2.imie = "Tom Smith";
		osoba2.wiek = 27;
		
		
		System.out.println(osoba1.imie + "\n" + osoba1.wiek + osoba2.imie);
	}

}
