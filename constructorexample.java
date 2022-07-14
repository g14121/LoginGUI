
class ball{
	
	
	double num1;
	int num2;
	double num3;
	
	
	public  ball() {
			
		
		num1=6;
	
		num2=7;
		
	System.out.println("hi");
	
	}


	public  ball(int n) {
			
		
		num1=n;
	
		num2=n+1;
		
	}
	
	
		public  ball(double d,int i) {
				
			
			num1=d;
			num2=i;
		
			
			
		
		
		

	}
	
	
	
}





public class constructorexample {

	public static void main(String[] args) {
	
	
	
	ball obj;
	obj=new ball(8);
	
	System.out.println(obj.num1);
	
	System.out.println(obj.num2);
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	}
	
}
