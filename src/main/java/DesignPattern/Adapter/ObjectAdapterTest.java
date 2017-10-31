package DesignPattern.Adapter;

public class ObjectAdapterTest {

	public static void main(String[] args) {
		Source source=new Source();
		Targetable target=new ObjectAdapter(source);
		target.method1();
		target.method2();
	}

}
