package Observer;

public class Werkstatt extends KfzRegistry implements Waschanlage{
	
	public int getAppointment() {
		
		return (int)((Math.random()) * 30 + 1);
	}
	
	public String getInfo() {
		
		return "Sie besitzen einen LKW.";
	}
	
	public void waschen() {
		
	}
	
	public void trocknen() {
		
	}
	
	public static void main(String[] args) {

		Werkstatt ws = new Werkstatt();
		Pkw audi = new Pkw(ws, 1997, 5);
		Lkw man = new Lkw(ws, 2007, 18);
		
		ws.register(audi);
		ws.register(man);
		
		ws.inform();
	
		ws.unregister(man);
		
		Waschanlage wa = ws;
		
		wa.waschen();
		wa.trocknen();
		
		if (wa instanceof Werkstatt)
			((Werkstatt) wa).inform();
		
	}
	
	
}
