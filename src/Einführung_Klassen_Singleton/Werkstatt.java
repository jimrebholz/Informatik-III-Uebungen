package Einführung_Klassen_Singleton;
import Einführung_Klassen_Singleton.Motor;
import Einführung_Klassen_Singleton.PKW;
import Einführung_Klassen_Singleton.Parkhaus;

//Pro Klasse eine Datei, beinhaltet sowohl Deklaration als auch Methoden
//In Werkstatt werden keine Include gebraucht
public class Werkstatt {

	@SuppressWarnings("unused")
	//args als Übergabeparamter, zB aus Konsole aufgerufen + zusätzliche Zeichen
	//Klassenmethode, Klasse kann aufgerufen werde über static, ohne das Objekt erzeugt werden muss
	public static void main(String[] args) {
	
		 Motor V4 = new Motor(200);
		 
		 //2004 Call-by-Value, V4 Call-by-Reference
		 //(2004, null) geht auch, jedoch dann p2.getMotor().getPs() als Null Pointer Exeption
		 PKW audi = new PKW(2004, V4);
		 PKW vw = new PKW(1965, V4);
		 //Plate wird angelegt, jedoch noch mit Null initialisiert
		 //Kennzeichen als String -> plate als Objekt kann daher Null sein
		 
		 V4.tune(80);
		
		 System.out.println("Der Motor besitzt " + V4.getPS() + "PS.");
		 
		 if (audi.isOldtimer() == true) 
			 System.out.println("Das Auto ist ein Oldtimer.");
			 
		 if (vw.isOldtimer() == true) 
			 System.out.println("Das Auto ist ein Oldtimer.");
		
		 //Verkettung von aurufen -> p1.getMotor().getPS()
		 audi.setPlate("SIG-JR-555");
		 System.out.println("Das Kennzeichen lautet: " + audi.getPlate());
		
		 //Motor wird direkte audiMotor zugewiesen
		 Motor audiMotor = audi.getMotor();
		 Motor vwMotor = vw.getMotor();
		 
		 //Hier wird static benötigt, da Objekt nur in Klasse selber erzeugt wird
		 Parkhaus parkhaus = Parkhaus.getInstance();
		 parkhaus.push(audi);
		 parkhaus.push(vw);
		 System.out.println("Die Anzahl an Autos im Parkhaus beträgt: " + parkhaus.getCount() + " Autos");
		 
	 }
	
}
