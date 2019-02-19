package properties;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class UnbindDemo {
	public static void main(String[] args) {
		IntegerProperty aProp = new SimpleIntegerProperty(10);
		IntegerProperty bProp = new SimpleIntegerProperty(0);
		
		bProp.bind(aProp);
		aProp.set(15);
		
		System.out.println(aProp.get());
		System.out.println(bProp.get());
		
		bProp.unbind();
		aProp.set(25);
		
		System.out.println(aProp.get());
		System.out.println(bProp.get());

	}
}
