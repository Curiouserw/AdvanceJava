package DesignPattern.FactoryMethod;

public class MutilSendFactory {
	public Sender produceMail(){
		return new MailSender();
	};
	public Sender produceSma(){
		return new SmsSender();
	};
}
