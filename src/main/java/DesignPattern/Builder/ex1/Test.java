<<<<<<< HEAD
package DesignPattern.Builder.ex1;

public class Test {
	public static void main(String[] args) {
		
		Computer lenoveComputer = null;    
        ComputerBuilder lenoveComputerBuilder = 
        		new LenoveComputerBuilder();    
		Director director = 
				new Director(lenoveComputerBuilder);
		director.construct();
		lenoveComputer = 
				lenoveComputerBuilder.getComputer();
		System.out.println(lenoveComputer);
	}
}	
=======
package DesignPattern.Builder.ex1;

public class Test {
	public static void main(String[] args) {
		
		Computer lenoveComputer = null;    
        ComputerBuilder lenoveComputerBuilder = 
        		new LenoveComputerBuilder();    
		Director director = 
				new Director(lenoveComputerBuilder);
		director.construct();
		lenoveComputer = 
				lenoveComputerBuilder.getComputer();
		System.out.println(lenoveComputer);
	}
}	
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
