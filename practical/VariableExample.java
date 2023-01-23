class VariableExample{
       static int num =12;
	   long num1 = 265473;
	   
	public void display(){
	    char a ='H';
		double num2 =24.777;
		System.out.println("Local variable value:"+a);
		System.out.println("Local variable value:"+num2);
	}   
	public static void calc(){
	    double b =88.47;
		double c =45.47;
		double res =b * c;
		System.out.println("Result is:"+res);
	}
public static void main(String args[]){
    VariableExample obj=new VariableExample();
	obj.display();
	calc();
	System.out.println("Instance variable value:"+obj.num1);
	System.out.println("Static variable value:"+num);
}	
}