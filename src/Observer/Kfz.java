package Observer;

public abstract class Kfz {

	private int baujahr;
	private String plate;
	
	public Kfz(int bj) {
		
		this.baujahr = bj;
	}
	
	public int getBaujahr() {
		
		return baujahr;
	}
	
	public void setPlate(String s) {
		
		this.plate = s;
	}
	
	public String getPlate() {

		return plate;
	}
	
	public abstract void takeAction();
	
}
