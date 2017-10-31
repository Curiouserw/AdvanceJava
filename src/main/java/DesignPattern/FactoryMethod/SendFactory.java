<<<<<<< HEAD
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
=======
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
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
