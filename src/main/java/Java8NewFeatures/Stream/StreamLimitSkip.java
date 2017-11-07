package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamLimitSkip {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("test","javap","hello","world","java","tom","C","javascript");	
		list.stream().limit(5).forEach(System.out::println);
		System.out.println("----------------");
		list.stream().skip(3).forEach(System.out::println);
	}

}
