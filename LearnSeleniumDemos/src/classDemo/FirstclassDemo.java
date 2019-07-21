package classDemo;

public class FirstclassDemo {

	int x=60;
	int y=100;
			
	public static void main(String[] args) {
		
		FirstclassDemo obj1=new FirstclassDemo();
		System.out.println(obj1.sum(89,100));
		System.out.println(obj1.sub(302,35));
    
	}

	public int sum(int a,int b){
	    int c=a+b;
	    return c;	
				
	}
	
   public int sub (int a,int b){
		
		
		int c=a-b;
		return c;
				
	}
	
	
	
}
