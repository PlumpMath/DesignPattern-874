package ch07proxy;

public class Proxier implements GiveGift {
	
	Pursuit gg;
	
	public Proxier(SchoolGirl mm) {
		gg.mm = mm;
		
	}

	public void GiveChocolate() {
		// TODO Auto-generated method stub
		gg.GiveChocolate();

	}

	public void GiveDolls() {
		// TODO Auto-generated method stub
		gg.GiveDolls();

	}

	public void GiveFlowers() {
		// TODO Auto-generated method stub
		gg.GiveFlowers();

	}

}
