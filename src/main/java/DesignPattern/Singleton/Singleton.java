package DesignPattern.Singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Singleton  implements Serializable{
	//volatile �����������������ڶ��߳������α���
	//���ã���ʾ��ʱ���ڴ��л�ȡ������ֵ��û����ʱ��
	private volatile static Singleton instance=null;
	
	private Singleton(){}
	
	public  static Singleton getInstance(){
		if(instance==null){
			synchronized (Singleton.class) {
				if (instance==null) {
					instance=new Singleton();
				}
			}
		}
		return  instance;
	}
	
	//readResolve������ObjectOutputStream�����á�
	  public Object readResolve() {  
	        return instance;  
	  } 
	 public static void main(String[] args) throws IOException, ClassNotFoundException {
		Singleton ton1=Singleton.getInstance();
		Singleton ton2=Singleton.getInstance();
		System.out.println((ton1==ton2)+" "+ton1);
		
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(baos);
		oos.writeObject(ton2);
		
		
		ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
		Singleton ton=(Singleton)ois.readObject();
		System.out.println((ton==ton1)+" "+ton1+" "+ton);
	}
}
