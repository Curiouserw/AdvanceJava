<<<<<<< HEAD
package DesignPattern.Singleton;

public class SynchronizedSingleton {
	public static SynchronizedSingleton instance=null;
	private SynchronizedSingleton(){
	}
	
	public synchronized static SynchronizedSingleton getInstance(){
		if(instance==null){
			instance=new SynchronizedSingleton();
		}
		return  instance;
	}
}
=======
package DesignPattern.Singleton;

public class SynchronizedSingleton {
	public static SynchronizedSingleton instance=null;
	private SynchronizedSingleton(){
	}
	
	public synchronized static SynchronizedSingleton getInstance(){
		if(instance==null){
			instance=new SynchronizedSingleton();
		}
		return  instance;
	}
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
