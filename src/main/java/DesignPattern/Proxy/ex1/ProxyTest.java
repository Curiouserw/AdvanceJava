<<<<<<< HEAD
package DesignPattern.Proxy.ex1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Student stu=new Student();
		StudentService service=new StudentServiceImpl();
//		service.add(stu);
//		service.delete(stu);
//		service.query(10);
		ClassLoader loader=service.getClass().getClassLoader();
		Class<?> interfaces[]=StudentServiceImpl.class.getInterfaces();
		InvocationHandler handler=new ProxyHandler(service);
		StudentService proxy=(StudentService)Proxy.newProxyInstance(loader, interfaces, handler);
		
		System.out.println(proxy+"===========");
		proxy.add(stu);
		proxy.delete(stu);
		proxy.query(10);
	}
}
=======
package DesignPattern.Proxy.ex1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {
	public static void main(String[] args) {
		Student stu=new Student();
		StudentService service=new StudentServiceImpl();
//		service.add(stu);
//		service.delete(stu);
//		service.query(10);
		ClassLoader loader=service.getClass().getClassLoader();
		Class<?> interfaces[]=StudentServiceImpl.class.getInterfaces();
		InvocationHandler handler=new ProxyHandler(service);
		StudentService proxy=(StudentService)Proxy.newProxyInstance(loader, interfaces, handler);
		
		System.out.println(proxy+"===========");
		proxy.add(stu);
		proxy.delete(stu);
		proxy.query(10);
	}
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
