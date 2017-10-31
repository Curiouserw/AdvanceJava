<<<<<<< HEAD
package DesignPattern.Proxy.ex1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class ProxyHandler  implements InvocationHandler{
	private Object target;
	public ProxyHandler(Object target) {
		this.target=target;
	}
	public ProxyHandler() {
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object=method.invoke(target, args);
		System.out.println(proxy.getClass().getName());
		return object;
	}

}
=======
package DesignPattern.Proxy.ex1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


public class ProxyHandler  implements InvocationHandler{
	private Object target;
	public ProxyHandler(Object target) {
		this.target=target;
	}
	public ProxyHandler() {
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object object=method.invoke(target, args);
		System.out.println(proxy.getClass().getName());
		return object;
	}

}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
