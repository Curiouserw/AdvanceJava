package Java8NewFeatures.Lambda;

import java.util.Objects;
import java.util.function.Supplier;

public class LambdaMethodAndConstructorDemo {
	public static void main(String[] args) {
		//------------3--------
		Action2 a2=Integer::parseInt;
		System.out.println(a2.method("123"));
		//-------------4----------
		LambdaMethodAndConstructorDemo demo=new LambdaMethodAndConstructorDemo();
		Action3 a3=demo::method;
		//------------------------------
		CarCreator creator=Car::new;
		System.out.println(creator.create());
		
		
		Car c=Car.create(Car::new);
		
		
		
	}
	public void method(){
		System.out.println("asdas");
	}
}
//-----------------------2-------------------------------------------
@FunctionalInterface
interface Action2{
	Integer method(String str);
}

interface Action3{
	void method();
}
interface CarCreator{
	Car create();
}


//--------------------------1-------------------------------------
class Car{
	private String name;
	public Car(String name) {
		Objects.requireNonNull(name);
		this.name = name;
	}
	public Car(){
	}
	public static Car create(Supplier<Car> supplier){
		return supplier.get();
	}
	public void collide(Car car){
		System.err.println("the car collided"+car);
	}
	public void foolow(Car another){
		System.out.println(another+"followed");
	}
	public boolean repair(){
		System.out.println(this+"was repaired");
		return true;
	}
	
}