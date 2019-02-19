package properties;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class InvalidationListenerDemo {

	public static void main(String[] args) {
		IntegerProperty counter = new SimpleIntegerProperty(100);
		counter.addListener(new InvalidationListener() {
			@Override
			public void invalidated(Observable o) {
				System.out.println(o);
			}
		});

		counter.set(123);
	}

}
