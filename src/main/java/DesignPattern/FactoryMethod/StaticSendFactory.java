<<<<<<< HEAD
package DesignPattern.FactoryMethod;

public class StaticSendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
=======
package DesignPattern.FactoryMethod;

public class StaticSendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
