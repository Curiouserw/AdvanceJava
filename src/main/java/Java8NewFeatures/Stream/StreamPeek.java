package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeek {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("one", "two", "three", "four");
		List<String> list2 = list.stream()
					 .filter(e -> e.length() > 3)
					 .peek(e -> System.out.println("��һ�η���������ֵΪ: " + e))
					 .filter(e->e.length()>4)
					 .peek(e -> System.out.println("�ڶ��η���������ֵΪ: " + e))
					 .collect(Collectors.toList());
		System.out.println(list2.size());
	}

}
