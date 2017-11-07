package Java8NewFeatures.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicateDemo {

	public static void main(String[] args) {
		List<String> persons=Arrays.asList("terry","tracy","kevin","lucy","lily","tony");
		filter(persons, name->name.endsWith("y"));
		filter(persons, name->name.startsWith("t"));
		filter(persons, name->name.length()<5);
		filter(persons, name->true);
		filter(persons, name->false);
		filter(persons, name->name.equals("kevin"));
		filter(persons, name->name.startsWith("t")&&name.length()>4);
		filter(persons, name->name.endsWith("y")&&name.length()<6);
	}
	public static void filter(List<String> persons,Predicate<String> predicate){
//		for(String name:persons){
//			if (predicate.test(name)) {
//				System.out.println(name+"");
//			}
//		}
		persons.forEach(name->{
			if(predicate.test(name)){
				System.out.print(name+"  ");
				}});
		System.out.println("=============================");
	}
}


