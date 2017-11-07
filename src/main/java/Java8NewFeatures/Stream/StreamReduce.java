package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("test","javap","hello","world","java","tom","C","javascript");
		Optional<String> fin=list.stream().filter(s->s.length()>4).filter(e->e.startsWith("j")).map(s->s+"_Fuck").reduce((s1,s2)->s1+"@"+s2);
		System.out.println(fin.orElse("null"));
	}

}
