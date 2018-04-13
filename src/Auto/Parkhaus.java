package Auto;
import java.util.LinkedList;

//Vererbung über PKW extends KFZ, KFZ extends FZ
//Über super.plate wird auf nächstes plate in Hierarchie zugegriffen
//return ((Fz) this).plate -> Zugriff auf Großvater

public class Parkhaus {

	private static Parkhaus parkhaus = new Parkhaus();
	private int counter = 0;
	
	private Parkhaus() {}
	
	//Klassenmethode -> static, existiert ohne bestehendes Objekt
	//Kann über Klassenname.getInstance aufgerufen werden
	public static Parkhaus getInstance() {
		
		return parkhaus;
	}
	
	LinkedList<PKW> linkedList = new LinkedList<PKW> ();
	//Geht auch über Array -> public PKW[] pkws = new PKW[100]
	
	//Instanzmethode kann nur bei bestehendem Objekt aufgerufen werden, sonst Nullpointer-Fehler
	public void push(PKW pkw) {
		linkedList.add(pkw);
		counter++;
	} 
	
	public PKW pop() {
		PKW removedCar = linkedList.remove();
		counter--;
		return removedCar;
	}
	
	public int getCount() {
		
		return counter;
	}
	
}
