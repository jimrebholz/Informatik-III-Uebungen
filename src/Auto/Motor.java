package Auto;

//Hier kann ein Package eingefügt werden
public class Motor {

	private int ps;
	
	public Motor() {
		System.out.println("Motor wurde erzeugt");
	}
	
	public Motor(int p) {
		ps = p;
		System.out.println("Motor wurde erzeugt");
	}

	public void tune(int more) {
		ps += more;
		System.out.println("Der Motor besitzt jetzt " + ps + "PS.");
	}
	
	public int getPS() {
		return ps;
	}
}

