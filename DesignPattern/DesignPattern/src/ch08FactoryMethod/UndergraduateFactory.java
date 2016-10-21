package ch08FactoryMethod;

public class UndergraduateFactory implements IFactory {

	public LeiFeng CreateLeiFeng() {
		// TODO Auto-generated method stub
		return new Undergraduate();
	}

}
