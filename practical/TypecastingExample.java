class TypecastingExample{
    public static void main(String args[]){
	    //widennig
		int x =236;
		long z = x;
		System.out.println(x);
		System.out.println(z);
		double y = x;
		System.out.println(y);
		
		//narrowing
		double a = 657.76;
		int b = (int)a;
		System.out.println(a);
		System.out.println(b);
	}
}