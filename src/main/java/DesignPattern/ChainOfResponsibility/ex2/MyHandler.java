<<<<<<< HEAD
package DesignPattern.ChainOfResponsibility.ex2;

public class MyHandler extends AbStractHandler implements Handler {
	private String name;
	
	public MyHandler(String name) {
		this.name=name;
	}

	@Override
	public void operator() {
		System.out.println(name+"deal!");
		if(getHandler()!=null){
			getHandler().operator();
		}
	}
	
}
=======
package DesignPattern.ChainOfResponsibility.ex2;

public class MyHandler extends AbStractHandler implements Handler {
	private String name;
	
	public MyHandler(String name) {
		this.name=name;
	}

	@Override
	public void operator() {
		System.out.println(name+"deal!");
		if(getHandler()!=null){
			getHandler().operator();
		}
	}
	
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
