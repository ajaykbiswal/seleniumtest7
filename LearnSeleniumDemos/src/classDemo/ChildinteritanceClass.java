package classDemo;

public class ChildinteritanceClass extends InheritanceDemo {
   //Child class reference and child class object-This will allow to access all the methods of child class 
	//as well as base class.
	public static void main(String[] args) 
	{
		ChildinteritanceClass obj1=new ChildinteritanceClass();
		obj1.sum();
		obj1.sub();
		obj1.Div();
		obj1.Mul();

	}
	public void Mul(){
		System.out.println("Mul value is :450");
	}

	public void Div(){
		System.out.println("Div value is :152");
	}
	
	
	
	
}
