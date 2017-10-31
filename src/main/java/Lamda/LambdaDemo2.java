package Lamda;

public class LambdaDemo2 {
	
	
	public static void main(String[] args) {
		LambdaDemo2 l2=new LambdaDemo2();
//		Action1 a=()->System.out.println("hello");
		l2.a(()->System.out.println("haha"));
		Action2<String,Integer> a2=f->"这个数字就是:"+f;
		l2.b(a2);
	}
	private void a(Action1 a) {
		a.run();
	}
	private void b(Action2<String, Integer> a) {
		System.out.println(a.run(30));
	}
}
@FunctionalInterface
interface Action1{
	public void run();
}
@FunctionalInterface
interface Action2<T,F>{
	public T run(F f);
}

