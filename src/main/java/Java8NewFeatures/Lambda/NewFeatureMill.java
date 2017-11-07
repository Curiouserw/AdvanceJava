

public class NewFeatureMill {
	
	
	@FunctionalInterface
	interface Mill{
		void m1();
		default void m2(){
			System.out.println("--------");
		}
		static void m3(){
			System.out.println("!!!!!!!!!!!!!!!");
		}
	}
	
	
	
	
	
}
