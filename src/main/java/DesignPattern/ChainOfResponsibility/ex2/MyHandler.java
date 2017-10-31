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
