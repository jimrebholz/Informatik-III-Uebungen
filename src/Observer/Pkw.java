package Observer;

public class Pkw extends Kfz{

	private Werkstatt werkstatt;
	private int seats;
	
	public Pkw(Werkstatt ws, int bj, int st) {
		
		super(bj);
		this.werkstatt = ws;
		this.seats = st;
	}
	
	public int getSeats() {
		
		return seats;
	}
	
	public boolean isOldtimer() {
		
		if (2018 - ((Kfz) this).getBaujahr() >= 30) 
			return true;
		else 
			return false;	
	}
	
	public void takeAction() {
		
		System.out.println("Sie bekommen einen Termin in " + werkstatt.getAppointment() + " Tagen.");
	}

	
	
}
