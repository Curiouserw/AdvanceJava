<<<<<<< HEAD
package DesignPattern.AbstractFactory;

public class Test {

	public static void main(String[] args) {
		Provider provider=new SendSmsFactory();
		Sender sender=provider.produce();
		sender.send();
	}

}
=======
package DesignPattern.AbstractFactory;

public class Test {

	public static void main(String[] args) {
		Provider provider=new SendSmsFactory();
		Sender sender=provider.produce();
		sender.send();
	}

}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
