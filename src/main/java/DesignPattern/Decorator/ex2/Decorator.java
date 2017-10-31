<<<<<<< HEAD
package DesignPattern.Decorator.ex2;

public class Decorator implements Sourceable{
	private Sourceable source;
	
	public Decorator(Sourceable source) {
		super();
		this.source=source;
	}

	@Override
	public void method() {
	    System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");  
	}

}
=======
package DesignPattern.Decorator.ex2;

public class Decorator implements Sourceable{
	private Sourceable source;
	
	public Decorator(Sourceable source) {
		super();
		this.source=source;
	}

	@Override
	public void method() {
	    System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");  
	}

}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
