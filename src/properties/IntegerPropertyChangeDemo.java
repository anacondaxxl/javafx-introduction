package properties;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class IntegerPropertyChangeDemo {

	public static void main(String[] args) {
		IntegerProperty counter = new SimpleIntegerProperty(100);
		counter.addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> prop, Number oldValue, Number newValue) {
				System.out.println("Counter changed: ");
				System.out.println("Old = " + oldValue + ", new = " + newValue);
			}
		});

		counter.set(123);
	}

}
