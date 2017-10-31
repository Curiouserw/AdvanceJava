<<<<<<< HEAD
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
=======
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
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
