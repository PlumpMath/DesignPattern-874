package ch25mediator;

public abstract class Country {
	
	protected UnitedNations mediator;

	public Country(UnitedNations mediator) {
		super();
		this.mediator = mediator;
	}
	
	

}
