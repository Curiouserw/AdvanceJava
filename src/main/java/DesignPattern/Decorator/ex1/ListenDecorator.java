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
