class casioo{
	
	int num1;
	int num2;
	String operation;
	
	
	public casioo() {
		
		num1=0;
		num2=0;
		operation="Nothing";
	}
	
public casioo(int i,int j) {
		
		num1=i;
		num2=j;
		operation="Nothing";
	}
public casioo(int i, int j, String op) {
	
	num1=i;
	num2=j;
	operation=op;
	
}

}
public class constructoroverloading {
public static void main(String[] args)
{
	casioo obj;
	obj=new casioo(4,5,"Add");
	
	System.out.println(obj.num1);
	System.out.println(obj.num2);
	
}
}
