package Java8NewFeatures.Lambda;

import java.util.List;

public class LPActionDemo {

	public static void main(String[] args) {
		List<User> users=Users.users;
		users.parallelStream().filter(user->{
			System.out.println("this is test");
			return user.getGender()==User.Gender.MALE;})
		.count();
		System.out.println("======");
	}
}
