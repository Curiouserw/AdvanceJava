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
