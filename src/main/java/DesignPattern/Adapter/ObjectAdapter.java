package DesignPattern.Adapter;

public class ObjectAdapter implements Targetable {
	private Source source;
	public ObjectAdapter(Source source) {
		this.source=source;
	}

	public void method1() {
		source.method1();
		
	}


	public void method2() {
		System.out.println("this is the targetable method !");
	}
	
}
