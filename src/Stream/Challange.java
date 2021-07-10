package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Challange {

	public static void main(String[] args) {

		System.out.println(getString(Arrays.asList(3, 44))); // isEqualTo("o3,e44");

	}

	public static String getString(List<Integer> list) {
		
		return list.stream().map(i -> {
				if (i % 2 == 0) {
					return "e" + String.valueOf(i);
				} else {
					return "o" + String.valueOf(i);
				}
			}).collect(Collectors.joining(","));

	
	}

}


