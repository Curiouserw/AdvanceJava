package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StreamCollectorsCharGroup {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("test","hello","world","java","tom","C","javascript");
//		Map<Integer, List<String>> collect = list.stream()
//				.collect(java.util.stream.Collectors.groupingBy(String::length));
//		System.out.println(collect);
		Map<Boolean, List<String>> collect = 
				list.stream()
				.collect(java.util.stream.Collectors.partitioningBy(s->s.indexOf("java")!=-1));
		for(Boolean b:collect.keySet()){
			System.out.println(b+" : "+collect.get(b).size());
		}
	}

}
