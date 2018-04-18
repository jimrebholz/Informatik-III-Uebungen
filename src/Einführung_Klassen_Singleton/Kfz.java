package Einführung_Klassen_Singleton;

//Von dieser Klasse kann über Kfz kein Objekt erstellt werden
public abstract class Kfz {
	
	//Die von den Oberklassen zur Verfügung gestellten Variablen, werden bei gleichen Variablen 
	//in den Unterklassen verdeckt oder super.plate -> Instanzvariable aus Oberklasse
	//Ist keine Variable verfügbar, wird in der Oberklassen gesucht
	final String plate = "Plate aus Kfz"; //-> final = const
	
	//gezieltes Suchen über cast-Operator -> aktuelle Variable aus anderer Klasse zuweisen
	//((Kfz) this).plate
	
	//Implementierung muss in Unterklasse erfolgen; nur Deklaration ohne Implementierung
	abstract String getPlate();
	
}
