class UnaryExample{
    public void calcIncrement(){
	    int x= 10;
		System.out.println(x++);//print 10  10+1=11
        System.out.println(x++);//print 11  11+1=12
        System.out.println(++x);//print 13  12+1=13  
        System.out.println(x++);//print 13  13+1=14
        System.out.println("Final increment value: "+x);//print   14
	}
	public void calcDecrement(){
	    int x= 10;
		System.out.println(x--);//print 10  10-1=9
        System.out.println(x--);//print 9   9-1=8
        System.out.println(--x);//print 7   8-1=7  
         System.out.println(--x);//print 6  7-1=6
		System.out.println(x--);//print 6   6-1=5
        System.out.println("Final decrement value: "+x);//print   5		
	}
    public static void main(String args[]){
	UnaryExample id=new UnaryExample();
	id.calcIncrement();
	id.calcDecrement();
	
	
	}
	
}