package Einführung_Klassen_Singleton;

//Pkw erbt von Kfz -> Kfz Oberklasse
//über final gibt es keine Unterklassen mehr von PKW
public final class PKW extends Kfz{
	
	//Instazvariable, für jedes Objekt wird neuer Speicher angelegt
	private int baujahr;
	private String plate;
	private Motor motor;
	
	//Variable kann im Klassenkontext angesprochen werden
	//Kann auch ohne ein bestehendes Objekt verwendet werden
	//Nur einmal wird Speicher angegelt
	static int counter = 0;
	//Static Variablen gehören zur Klasse und werden von den verschiedenen 
	//Objekten geteilt
	
	
	public PKW() {
		System.out.println("PKW wurde erzeugt");
	}
	
	public PKW(int baujahr) {
		this.baujahr = baujahr;
		System.out.println("PKW wurde erzeugt");
	}
	
	public PKW(int baujahr, Motor m) {
		this.baujahr = baujahr;
		motor = m;
		System.out.println("PKW wurde erzeugt");
	}
	
	int getBaujahr() {
		return baujahr;
	}
	
	public boolean isOldtimer() {
		if ((2018 - baujahr) > 30)
			return true;
		else
			return false;
	}
	
	public void setPlate(String p) {
		plate = p;
	}
	
	public String getPlate() {
		return plate;
	}
	
	public Motor getMotor() {
		return motor;
	}
}
