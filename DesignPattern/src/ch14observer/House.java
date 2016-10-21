package ch14observer;

import java.util.Observable;

public class House extends Observable{
	private float price;

	public House(float price) {
		super();
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		super.setChanged();
		super.notifyObservers(price);
		this.price = price;
	}
}


