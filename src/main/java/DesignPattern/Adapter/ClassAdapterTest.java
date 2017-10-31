package DesignPattern.Adapter;


public interface ClassAdapterTest {
	public static void main(String[] args) {
		Targetable target=new ClassAdapter();
		target.method1();
		target.method2();
	}
}
