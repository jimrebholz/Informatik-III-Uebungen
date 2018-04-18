package Observer;

public class Lkw extends Kfz{
	
	private Werkstatt werkstatt;
	private int load;
	
	Lkw(Werkstatt ws, int bj, int ld) {
		
		super(bj);
		this.werkstatt = ws;
		this.load = ld;
	
	}
	
	public int getLoad() {
		
		return load;
	}
	
	public void takeAction() {
		
		System.out.println(werkstatt.getInfo());
	}

}
