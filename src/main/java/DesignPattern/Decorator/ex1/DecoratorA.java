<<<<<<< HEAD
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
=======
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
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
