package Java8NewFeatures.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

public class LambdaReduceDemo {
	private final static List<User> users = 
		Arrays.asList(new User(1, "terry", 12,User.Gender.MALE),  
	            new User(2,"lucy", 21, User.Gender.FEMALE),  
	            new User(3,"robin", 32, User.Gender.MALE),  
	            new User(4, "tracy", 32, User.Gender.FEMALE));
	public static void main(String[] args) {
		// 璁＄畻鎵�鏈変汉鐨勫钩鍧囧勾榫�
		double avgAge = 
		users.parallelStream()
		.mapToInt(User::getAge)
		.average()
		.getAsDouble();
		System.out.printf("Avg age is : %.1f \n",avgAge);
		// 璁＄畻鎵�鏈変汉鐨勫勾榫勬�诲拰
		int ages = users.stream().mapToInt(User::getAge)
		//.sum();
		.reduce(0,(x,y)->x+y);
		System.out.printf("All ages is : %d \n",ages);
		// 鑾峰彇鎵�鏈夌敺鎬х敤鎴风殑骞冲潎骞撮緞
		/*users.parallelStream().filter
		(u->u.getGender() == User.Gender.MALE)
		.mapToInt(User::getAge)
		.average();*/
		/*
		 * 涓嶳educe鏂规硶涓嶅悓,Stream.collect淇敼鐜板瓨鐨勫�硷紝
		 * 鑰屼笉鏄瘡澶勭悊涓�涓厓绱狅紝鍒涘缓涓�涓柊鍊� 
		 */
		Averager averager = users.parallelStream().filter
		(u->u.getGender()==User.Gender.MALE)
		.map(User::getAge)
		.collect(Averager::new,
				Averager::accept,
				Averager::combine);
		System.out.printf("Average age of males is: %.1f\n",
		 averager.average());
		// 鑾峰彇骞撮緞澶т簬20鐨勭敤鎴峰垪琛�
		List<User> listUser = 
		users.parallelStream()
		.filter(u -> u.getAge()>20)
		.collect(Collectors.toList());
		System.out.println(listUser);
		System.out.println("===========");
		// 鎸夌収鎬у埆缁熻鐢ㄦ埛鏁伴噺
		Map<User.Gender,Integer> countByGender = 
		users.parallelStream()
		.collect(Collectors.groupingBy
		(User::getGender,
		Collectors.summingInt(u->1)));
		System.out.println(countByGender);
		
		// 鎸夌収鎬у埆缁熻鐢ㄦ埛鍚嶇О
		Map<User.Gender,List<String>> namesForGender = 
		users.parallelStream()
		.collect(Collectors.groupingBy
		(User::getGender,
		Collectors.mapping
		(User::getName,Collectors.toList())));
		System.out.println(namesForGender);
		
		// 鎸夌収鎬у埆姹傚勾榫勬�诲拰
		Map<User.Gender,Integer> agesForGender = 
		users.parallelStream()
		.collect(Collectors.groupingBy
		(User::getGender,Collectors.reducing
		(0,User::getAge, Integer::sum)));
		System.out.println(agesForGender);
		// 鎸夌収鎬у埆姹傚勾榫勫钩鍧囧��
		Map<User.Gender,Double> avgAgeForGender = 
		users.stream()
		.collect(Collectors.groupingBy
		(User::getGender,
		Collectors.averagingInt(User::getAge)));
		System.out.println(avgAgeForGender);
	}
}
class Averager implements IntConsumer{
	private int total;
	private int count;
	
	public double average(){
		return count>0?((double)(total/count)):0;
	}
	@Override
	public void accept(int value) {
		total+=value;
		count++;
	}
	public void combine(Averager other){
		total += other.total;
		count += other.count;
	}
}
class User{
	enum Gender{
		MALE,FEMALE
	}
	private int no;
	private String name;
	private int age;
	private Gender gender;
	
	public User() {
	}
	public User(int no, String name, int age, Gender gender) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
}
