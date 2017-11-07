package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;

public class Collectors {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("test","hello","world","java","tom","C","javascript");
		List<String> tolist=list.stream().filter(s->s.length()>4).collect(java.util.stream.Collectors.toList());
		
		System.out.println(tolist);
	}

}
