package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirst {

	public static void main(String[] args) {
		List<String> list = Arrays.asList();
		Optional<String> first = list.stream().findFirst();
		System.out.println(first.orElse("ֵΪnull"));
	}

}
