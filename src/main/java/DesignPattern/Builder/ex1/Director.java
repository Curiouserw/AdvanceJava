<<<<<<< HEAD
package DesignPattern.Builder.ex1;

public class Director {
	private ComputerBuilder builder;     
    public Director(ComputerBuilder builder) {     
        this.builder = builder;     
    }    
    public void construct() {
    	builder.buildCPU();
    	builder.buildMemory();
    	builder.buildMainboard();
    }
}
=======
package DesignPattern.Builder.ex1;

public class Director {
	private ComputerBuilder builder;     
    public Director(ComputerBuilder builder) {     
        this.builder = builder;     
    }    
    public void construct() {
    	builder.buildCPU();
    	builder.buildMemory();
    	builder.buildMainboard();
    }
}
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
