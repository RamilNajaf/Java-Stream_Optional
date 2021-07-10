package Stream;

import java.util.Comparator;
import java.util.List;

public class MaxAndComparator {
	
	public static void main(String[] args) {
		
	}

	public static Person getOldestPerson(List<Person> people) {
		Person oldestPerson = new Person("", 0);
		for (Person person : people) {
			if (person.getAge() > oldestPerson.getAge()) {
				oldestPerson = person;
			}
		}
		return oldestPerson;
	}

	public static Person getOldestPerson2(List<Person> people) {
           return people.stream().max(Comparator.comparing(Person::getAge)).orElse(null);
	}

}
