<<<<<<< HEAD
package DesignPattern.Builder.ex1;

public class HPComputerBuilder implements ComputerBuilder {  
   private Computer HPComputer;    
   
   public HPComputerBuilder(){  
       HPComputer = new Computer();  
   }  
     
   @Override  
   public void buildCPU() {  
       HPComputer.setCpu(new AMDCPU());  
 
   }  
 
   @Override  
   public void buildMemory() {  
       HPComputer.setMemory(new SamsungMemory());  
   }  
 
   @Override  
   public void buildMainboard() {  
       HPComputer.setMainboard(new GaMainboard());  
 
   }  
 
   @Override  
   public Computer getComputer() {  
       return HPComputer;  
   }  
 
}  
=======
package DesignPattern.Builder.ex1;

public class HPComputerBuilder implements ComputerBuilder {  
   private Computer HPComputer;    
   
   public HPComputerBuilder(){  
       HPComputer = new Computer();  
   }  
     
   @Override  
   public void buildCPU() {  
       HPComputer.setCpu(new AMDCPU());  
 
   }  
 
   @Override  
   public void buildMemory() {  
       HPComputer.setMemory(new SamsungMemory());  
   }  
 
   @Override  
   public void buildMainboard() {  
       HPComputer.setMainboard(new GaMainboard());  
 
   }  
 
   @Override  
   public Computer getComputer() {  
       return HPComputer;  
   }  
 
}  
>>>>>>> d72333c815f4b39f390984460e3ae30b9fe80e16
