package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamCount {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("test","hello","world","java","tom","C","javascript");
		long count=list.stream().filter(e->e.startsWith("j")).count();
		System.out.println(count);
	}

}
