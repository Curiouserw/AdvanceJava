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
