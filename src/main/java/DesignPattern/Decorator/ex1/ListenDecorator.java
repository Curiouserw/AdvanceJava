<<<<<<< HEAD
package DesignPattern.Decorator.ex1;

public class ListenDecorator extends DecoratorA{

	public ListenDecorator(Action action) {
		super(action);
		// TODO Auto-generated constructor stub
	}
	public void go(){
		listen();
		super.go();
	}
	private void listen() {
		System.out.println("�������裡");
	}

}
=======
package DesignPattern.Decorator.ex1;

public class ListenDecorator extends DecoratorA{

	public ListenDecorator(Action action) {
		super(action);
		// TODO Auto-generated constructor stub
	}
	public void go(){
		listen();
		super.go();
	}
	private void listen() {
		System.out.println("�������裡");
	}

}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
