package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class ToUpperCase {

	public static void main(String[] args) {

		mapToUppercase2("A", "b", "c");

	}

	public static Collection<String> mapToUppercase(String... names) {
		Collection<String> uppercaseNames = new ArrayList<>();
		for (String name : names) {
			uppercaseNames.add(name.toUpperCase());
		}
		return uppercaseNames;
	}

	public static Collection<String> mapToUppercase2(String... names) {
		return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());
	}

}
