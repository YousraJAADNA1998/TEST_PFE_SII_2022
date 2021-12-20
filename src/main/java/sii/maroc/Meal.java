package sii.maroc;

import java.awt.List;

public class Meal {
	
	private Ticket t;
	
	public Meal(Ticket t) {
		super();
		this.t = t;
	}

	public Meal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int servedDishes() {
		// TODO Auto-generated method stub
		return Integer.parseInt(t.getD());
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		int n =Integer.parseInt(t.getD());
		//int m = Integer.parseInt(t.getDishes());
		int duration = 0;
		int durationsec=0;
		
		if(n==1) {
			duration=6;
			//durationsec=10;
		}
		
		else{
			duration+=6;
			//durationsec+=10;
			
			for(int i=1;i<n;i++) {
				duration+=3;
			}
			/*for(int j=1;j<m;j++) {
				durationsec+=5;
			}*/
		}
		return duration+durationsec;
	}

}
