package DesignPattern.FactoryMethod;

public class SendFactory {

	public Sender produce(String type){
		if("main".equals(type)){
			return new MailSender();
		}else if ("sms".equals(type)) {
			return new SmsSender();
		}else{
			System.out.println("��������ȷ����!");
			return null;
		}
	}	

}
