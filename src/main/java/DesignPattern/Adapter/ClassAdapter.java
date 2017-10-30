package DesignPattern.Adapter;

public class ClassAdapter extends Source implements Targetable{
	public void method2() {
		System.out.println("this is the targetable method");
	}

}
