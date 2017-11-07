package Java8NewFeatures.Stream;

import java.util.stream.Stream;

public class StreamGenerate {

	public static void main(String[] args) {
		Stream.generate(()->(int)(Math.random()*100))
		.limit(100)
		.forEach(System.out::println);
	}

}
