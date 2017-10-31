package DesignPattern.FactoryMethod;

public class MutiSendFactoryTest {

	public static void main(String[] args) {
		MutilSendFactory msf=new MutilSendFactory();
		Sender sender=msf.produceMail();
		sender.Send();

	}

}
