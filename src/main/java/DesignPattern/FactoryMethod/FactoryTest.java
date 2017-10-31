<<<<<<< HEAD
package DesignPattern.FactoryMethod;

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory=new SendFactory();
		Sender sender=factory.produce("sms");
		sender.Send();
	}
}
=======
package DesignPattern.FactoryMethod;

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory factory=new SendFactory();
		Sender sender=factory.produce("sms");
		sender.Send();
	}
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
