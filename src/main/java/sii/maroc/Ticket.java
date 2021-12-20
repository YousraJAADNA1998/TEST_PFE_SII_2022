package sii.maroc;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	
	private String d;
	
	
	
	private String dishes;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(String d) {
		super();
		this.d = d;
		
	}


	public Ticket and(String string) {
		// TODO Auto-generated method stub
		
		String[]D=string.split("");
		dishes = D[0];
		if(!dishes.equals(null)) {
			Integer numberd = Integer.parseInt(d)+Integer.parseInt(dishes);
			return new Ticket(numberd.toString());
		}
		
        
		return new Ticket(string);
	}

	public String getD() {
		return d;
	}

	public void setD(String d) {
		this.d = d;
	}

	public String getDishes() {
		return dishes;
	}

}
