package Lamda;

public class LambdaDemo4 {
	public static void main(String[] args) {
		Model m=new Model();
		
		
		Action a1=(s)->System.out.println("hello");
		a1.run(m);
		
		Action<Model> a2=Model::test3;
		a2.run(m);
		
		Action<Model> a3=m::test2;
		a3.run(m);
	}
}
class Model{
	public void test1() {
		System.out.println("test1");
	}
	void test2(Model a){
		System.out.println("test2");
	}
	int test3() {
		System.out.println("test3");
		return 1;
	}
}

interface Action<T>{
	void run(T t);
}
