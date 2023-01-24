class ComparisonExample{
    public void cal(){
	    int a=14 , b=6;
		
		System.out.println("a>b:" +(a>b));
		System.out.println("a<b:" +(a<b));
		System.out.println("a>=b:" +(a>=b));
		System.out.println("a<=b:" +(a<=b));
		System.out.println("a==b:" +(a==b));
		System.out.println("a!=b:" +(a!=b));
		System.out.println((a>b)&&(a++<b));//false logical and
		System.out.println((a>b)&(a++>b));//bitwise and
		System.out.println((a>b)||(a<b));//true logical or
		System.out.println((a>b)|(a<b));// bitwise or
		
	}
	public static void main(String args[]){
	ComparisonExample obj=new ComparisonExample();
	obj.cal();
	}
}
