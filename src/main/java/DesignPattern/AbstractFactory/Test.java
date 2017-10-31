package DesignPattern.AbstractFactory;

public class Test {

	public static void main(String[] args) {
		Provider provider=new SendSmsFactory();
		Sender sender=provider.produce();
		sender.send();
	}

}
