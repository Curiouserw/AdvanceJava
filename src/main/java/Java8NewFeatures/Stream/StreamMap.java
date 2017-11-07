package Java8NewFeatures.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {
	public static void main(String[] args) {
		Stream<String> wordList = Stream.of("hello","world","tom");
//		List<String> output = wordList.map(String::toUpperCase).collect(Collectors.toList());
	  	//Ҳ����ֱ��ʹ��forEachѭ�����
		wordList.map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
	}

}
