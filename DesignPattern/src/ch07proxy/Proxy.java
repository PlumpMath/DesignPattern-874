package ch07proxy;

public class Proxy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolGirl jj = new SchoolGirl();
		jj.setName("jj");
		
		Proxier dl = new Proxier(jj);
		
		dl.GiveDolls();
		dl.GiveFlowers();
		dl.GiveChocolate();

	}

}
