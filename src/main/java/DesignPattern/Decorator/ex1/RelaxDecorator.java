<<<<<<< HEAD
package DesignPattern.Decorator.ex1;

public class RelaxDecorator extends DecoratorA{

	public RelaxDecorator(Action action) {
		super(action);
	}
	public	void go(){
		super.go();
		relax();
	}
	private void relax() {
		System.out.println("������Ϣ");
	}
}
=======
package DesignPattern.Decorator.ex1;

public class RelaxDecorator extends DecoratorA{

	public RelaxDecorator(Action action) {
		super(action);
	}
	public	void go(){
		super.go();
		relax();
	}
	private void relax() {
		System.out.println("������Ϣ");
	}
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
