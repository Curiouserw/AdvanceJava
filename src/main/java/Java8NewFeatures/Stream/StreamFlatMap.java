package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMap {
	public static void main(String[] args) {
		Stream<List<Integer>> stream1 = Stream.of(
				 Arrays.asList(1),
				 Arrays.asList(2, 3),
				 Arrays.asList(4, 5, 6)
			 );
			Stream<Integer> stream2 = stream1.
			flatMap((e) -> e.stream());
			
			stream2.forEach(e->System.out.println(e));
	}
}
