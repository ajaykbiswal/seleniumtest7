package classDemo;

public class ChildinteritanceClass3 extends InheritanceDemo {
   //BASE class reference and child class object-This will allow to access all the methods of BASE class only
	//Not the child class methods
	
	public static void main(String[] args) 
	{
		InheritanceDemo obj1=new ChildinteritanceClass3();
		obj1.sum();
		obj1.sub();
//		obj1.Div();
//		obj1.Mul();

	}
	public void Mul(){
		System.out.println("Mul value is :450");
	}

	public void Div(){
		System.out.println("Div value is :152");
	}
	
	
	
	
}
