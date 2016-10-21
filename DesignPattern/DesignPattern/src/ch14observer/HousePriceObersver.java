package ch14observer;

import java.util.Observable;
import java.util.Observer;

public class HousePriceObersver implements Observer {
	private String name;
	public HousePriceObersver(String name) {
		super();
		this.name = name;
	}
	public void update(Observable o, Object arg) {
		
		if (arg instanceof Float) {
			System.out.println(this.name + "观察到房屋价格被改变");
			System.out.println(((Float)arg).floatValue());
		} 
		
	}
	

}
