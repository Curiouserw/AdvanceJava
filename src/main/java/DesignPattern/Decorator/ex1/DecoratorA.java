package DesignPattern.Decorator.ex1;

public abstract class DecoratorA implements Action {
	private Action action;
    public DecoratorA(Action action) {
		this.action=action;
	}
	@Override
	public void go() {
		this.action.go();
	
	}
}
