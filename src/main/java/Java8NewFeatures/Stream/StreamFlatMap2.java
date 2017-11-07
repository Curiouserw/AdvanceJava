package Java8NewFeatures.Stream;

import java.util.stream.Stream;

public class StreamFlatMap2 {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("tom.Li","lucy.Liu");
		Stream<String> stream2=stream.flatMap(s->Stream.of(s.split("[.]")));
		stream2.forEach(System.out::println);
	}

}
