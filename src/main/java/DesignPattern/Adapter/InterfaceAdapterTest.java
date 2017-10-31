package DesignPattern.Adapter;

public class InterfaceAdapterTest {
	public static void main(String[] args) {
//	       InterfaceAdapterSourceable source1 = new InterfaceAdapterSourceSub1();  
	        InterfaceAdapterSourceable source2 = new InterfaceAdapterSourceSub2();  
	        
//	        source1.method1();  
//	        source1.method2();  
	        source2.method1();  
	        source2.method2(); 
	}
}
