package collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		Set<Person> persons = new HashSet<>();
		
		persons.add(new Person("George"));
		persons.add(new Person("Mircea"));
		persons.add(new Person("Mihai"));
		persons.add(new Person("George"));
		
		System.out.println(persons.size());

	}

}
