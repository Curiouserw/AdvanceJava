package Java8NewFeatures.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

public class StreamToCaseSort {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\RationalMonster\\Desktop\\readMe.txt"));
		br.lines().
		   flatMap(s->Stream.of(s.split(" "))).
		   filter(s->s.length()>0).
		   map(s->s.toLowerCase()).
		   distinct().
		   sorted().
		   forEach(System.out::println);
	}

}
