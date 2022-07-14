class outer{
	
	int i=1;
	public void met() {
		
		System.out.println("hi");
	}
	class inner{                     //outer$inner.class
		public void dis() {
					
		System.out.println("gg");
		
		}
	}
	
}
public class innerclassdemo {
	public static void main(String[] args) {
		
		outer obj ;
		obj=new outer();
		
		obj.met();
		
		
								outer.inner obj1;
										obj1=obj.new inner();
		
												obj1.dis();
		
	}

	
}
