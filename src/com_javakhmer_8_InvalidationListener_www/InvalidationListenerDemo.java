package com_javakhmer_8_InvalidationListener_www;

//import javafx.beans.InvalidationListener;
//import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class InvalidationListenerDemo {

	public static void main(String[] args) {
		DoubleProperty balance = new SimpleDoubleProperty();
		balance.set(35);
		//System.out.println(balance.get());
		balance.addListener(/*new InvalidationListener() {
			
			@Override
			public void invalidated(Observable ov) {
				// TODO Auto-generated method stub
				System.out.println(balance.get());
			}
				
		}*/
				ov->{
					System.out.println(balance.get());
					balance.doubleValue();
				});
		balance.set(45);
		balance.set(90);
		balance.set(1);
	}
}
