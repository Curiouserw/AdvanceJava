package Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo1 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("hello","tom","apple","bbc");
		System.out.println(list);
		Collections.sort(list,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return -o1.compareTo(o2);
			}
		});
		System.out.println(list);
		Collections.sort(list,(s1,s2)->s1.compareTo(s2));
		System.out.println(list);
	}
}
