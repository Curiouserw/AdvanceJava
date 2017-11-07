package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSquareNums {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		List<Integer> squareNums = nums.stream().map(n -> n * n).collect(Collectors.toList());;
	}

}
