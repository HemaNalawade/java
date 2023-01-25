class OperatorExample{
	public void calArithmetic(){
  
	   int a = 12, b = 5;
	
          //Arithmetic Operator
	   System.out.println("----Arithmetic operator----");
           System.out.println(a + b);// addition operator
           System.out.println(a - b);// subtraction operator
           System.out.println(a * b); // multiplication operator
           System.out.println(a / b);// division operator
           System.out.println(a % b);// modulo operator
	}
	public void calRelation(){
    
	   int x=13 ,y=9;
		
	   //Relational operator
	   System.out.println("----Relational operator----");
	   System.out.println(x == y);//== operator
           System.out.println(x != y);// != operator
           System.out.println(x > y);// > operator 
           System.out.println(x < y);// < operator
           System.out.println(x >= y);// >= operator  
           System.out.println(x <= y); // <= operator 
	}
	public void calAssignment(){
    
		int x=8;
               //Assignment operator
		System.out.println("----Assignment operator----");
	        x+=2;
		System.out.println(x);//+= operator
	        x-=2;
		System.out.println(x);// -= operator	
		x*=2;
		System.out.println(x);// *= operator
		x%=2;	
		System.out.println(x);// %= operator	
		x&=2; 
		System.out.println(x);// &= operator  
		x|=2;
		System.out.println(x);//|= operator
	}
   
	public void calLogical(){
	   
		int a=14 , b=7;
	        //Logical operator
		System.out.println("----Logical operator----");
	        System.out.println((a> b)&&(a>b)); //And operator
		System.out.println((a< b)||(a<b)); //OR operator		
	}
	
	public void calTernary(){
	    
		int a=5 , b=6;
	        //Ternary operator	    
		System.out.println("----Ternary operator----");
		System.out.println((a> b)? a:b); 
		
	}
  
	public static void main(String args[]){
   
		OperatorExample obj=new OperatorExample();    
		obj.calArithmetic();	
		obj.calRelation();	
		obj.calAssignment();
	        obj.calLogical();
	        obj.calTernary();
}
}
