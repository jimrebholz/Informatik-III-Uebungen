package Observer;

public abstract class KfzRegistry {

	//LinkedList<Kfz> linkedList = new LinkedList<Kfz> ();
	private int anzahlKfz = 100;
	private Kfz[] kfzs = new Kfz[anzahlKfz];
	private int counter = 0;
	
	public void register (Kfz kfz) {
		
		if (counter >= 100) 
			System.out.println("Die maximale Anzahl an Kfz's wurde registriert.");
		else {
			kfzs[counter] = kfz;
			counter++;
			System.out.println("Ihr Kfz wurde registriert... (Mom. Anzahl an Kfz's: " + counter + ")");
		}
	}
	
	public void unregister (Kfz kfz) {
		
		for (int i = 0; i < counter; i++) {
			if (kfzs[i] == kfz) {
				kfzs[i] = null;
				
				for (int j = i + 1; j < counter; j++) {
					Kfz kfzObject = kfzs[j];
					kfzs[j - 1] = kfzObject;
				}
				break;
			}
		}
		counter--;
		System.out.println("Ihr Kfz wurde von der Liste gelöscht...");
	}
	
	public void inform() {
	
		for (int i = 0; i < counter; i++) 
			kfzs[i].takeAction();
	}
	
	
	
	
}
