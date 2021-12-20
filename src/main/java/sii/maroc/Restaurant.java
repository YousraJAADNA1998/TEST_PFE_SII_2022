package sii.maroc;

public class Restaurant {
	
	private int stockballsMozzarella=0;
	//private int stockballsMozzarella=0;
	private int stocktomatoes=0;
	//private int stocktomatoes=0;
	private int stockFlour=0;
	//private int stockFlour=0;
	
	
	
	

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String string, String string2, String string3, String string4){
		// TODO Auto-generated constructor stub
		stockballsMozzarella-=Integer.parseInt(string.substring(0,1));
		stocktomatoes-=Integer.parseInt(string2.substring(0,1));
		
	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6){
		// TODO Auto-generated constructor stub
		stockFlour-=Integer.parseInt(string.substring(0,1));
		stockballsMozzarella-=Integer.parseInt(string4.substring(0,1));
		stocktomatoes-=Integer.parseInt(string2.substring(0,1));
	}

	public Ticket order(String string) {
		// TODO Auto-generated method stub
		String[]D=string.split("");
		String dishes = D[0];
		
		Ticket t =new Ticket(dishes);
		return t;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		return new Meal(ticket);
	}
	public void OutOfStock()throws UnavailableDishException {
		if(stockballsMozzarella<=0||stocktomatoes<=0||stockFlour<=0) {
			throw new UnavailableDishException("Out of Stock");
		}
	}

	
	
}
