package DesignPattern.Builder;

import java.util.ArrayList;
import java.util.List;


public class Builder {
	private List<Sender> list=new ArrayList<Sender>();
	public void produreMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
	}
	public void pridureSmsSender(int count){
		for(int i=0;i<count;i++){
			list.add(new SmsSender());
		}
	}
}
