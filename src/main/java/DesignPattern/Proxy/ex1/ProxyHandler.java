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
