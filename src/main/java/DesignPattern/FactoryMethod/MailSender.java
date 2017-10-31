package DesignPattern.FactoryMethod;

public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mainsender");
	}	

}
