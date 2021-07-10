package Stream;

import java.util.Arrays;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

public class LetterCount {

	public static void main(String[] args) {
		System.out.println(getTotalNumberOfLettersOfNamesLongerThanFive("Aasdasdasd", "b", "c"));
	}

	public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {

		return Arrays.stream(names).filter(namee -> namee.length() > 5).mapToInt(String::length).sum();
	}
	

	public static int getTotalNumberOfLettersOfNamesLongerThanFive2(String... names) {
		
		return 	Arrays.stream(names).
				filter(name -> name.length() > 5).
				map(String::length)
				.collect(Collectors.summingInt(e -> e));
		
	}

}
