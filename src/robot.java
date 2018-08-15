//  nazawa w zwyk³ej (4 linijka) klasie musi pokrywac 
//  sie z nazw¹ nadawana w mainie(14 linijka)

class Robott {
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: "  + height);
	}
	
	public void move(String direction, double distance) {
		System.out.println("Moving "+ distance+ " meters in direction " + direction);
	}
}




public class robot {

	public static void main(String[] args) {
	
		Robott sam = new Robott();
		
		sam.speak("Hi Im Sam!");
		sam.jump(7);
		
		sam.move("West", 12.2);
		
		String greeting = "Hello there!";
		
		sam.speak(greeting);
		
		
	}

}
