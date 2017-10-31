<<<<<<< HEAD
package DesignPattern.FactoryMethod;

public class MutilSendFactory {
	public Sender produceMail(){
		return new MailSender();
	};
	public Sender produceSma(){
		return new SmsSender();
	};
}
=======
package DesignPattern.FactoryMethod;

public class MutilSendFactory {
	public Sender produceMail(){
		return new MailSender();
	};
	public Sender produceSma(){
		return new SmsSender();
	};
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
