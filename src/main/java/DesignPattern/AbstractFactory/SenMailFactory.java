package DesignPattern.AbstractFactory;




public class SenMailFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}
}
