package Stream;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Transform {
	public static void main(String[] args) {

		/*
		 * { {A, B, C} {D, E, F} } -> { A, B, C, D, E, F }
		 */

	}

	public static List<String> transform(List<List<String>> collection) {

		return collection.stream().flatMap(Collection::stream).collect(Collectors.toList());

	}

}

