package DesignPattern.ChainOfResponsibility.ex1;


interface Filter {
	String doFilter(String msg);
}

class SensitiveFilter implements Filter{
	private Filter filter;
	public String doFilter(String msg) {
		msg = msg.replace("����","**").replace("��","xx");
		if(filter!=null)
			return filter.doFilter(msg);
		else
			return msg;
	}
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
}

class CharFilter implements Filter{
	private Filter filter;
	public String doFilter(String msg) {
		msg = msg.replace(":)","^_^");
		if(filter!=null)
			return filter.doFilter(msg);
		else
			return msg;
	}
	public void setFilter(Filter filter) {
		this.filter = filter;
	}
}

public class FilterDemo {
	public static void main(String[] args) {
		String msg = "��������,�������õú�:)";
		System.out.println(msg);
		SensitiveFilter f1 = new SensitiveFilter();
		CharFilter f2 = new CharFilter();
		f1.setFilter(f2);
		System.out.println(f1.doFilter(msg));
	}
}