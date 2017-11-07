package Java8NewFeatures.Lambda;

public class LambdaDemo3 {
	public static void main(String[] args) {
		LambdaDemo3 l3=new LambdaDemo3();
		//调用类的静态方法,前提是接口中只有一个方法且方法的参数类型与返回值类型与调用类中的静态方法的参数与返回值一致
		Action3 a3=Integer::toBinaryString;
		System.out.println(a3.run(4));
		//调用对象中的非静态方法
		Action3 b3=l3::test;
		System.out.println(b3.run(4));
	}
	public String test(int i){
		return "i="+i;
	}
}

interface Action3{
	public String run(int Integer);
}
