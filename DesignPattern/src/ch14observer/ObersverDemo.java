package ch14observer;

public class ObersverDemo {

	public static void main(String[] args) {
		HousePriceObersver hpo1 = new HousePriceObersver("aa");
		HousePriceObersver hpo2 = new HousePriceObersver("bb");
		HousePriceObersver hpo3 = new HousePriceObersver("cc");
		
		House house = new House(999999);
		
		house.addObserver(hpo1);
		house.addObserver(hpo2);
		house.addObserver(hpo3);
		
		house.setPrice(9999999);
		
		
		
		
		
	}

}
