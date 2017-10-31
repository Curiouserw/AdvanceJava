package DesignPattern.Proxy.ex2;

public class ProxyTest {
	public static void main(String[] args) {
		Source source=new Source();
		Proxy p=new Proxy(source);
		p.method();
	}
}
