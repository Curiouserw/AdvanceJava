package DesignPattern.ChainOfResponsibility.ex2;

public abstract class AbStractHandler {
	private Handler  handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
}
