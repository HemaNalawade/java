package myJava;
//create a class...
 class my{
	 int num ;
	 
	String name;
	  public my(int num,String name) {
		  super();
		  this.num=num;
		  this.name=name;
	  }
	  @Override
		public String toString() {
			// TODO Auto-generated method stub
			return num+" "+name;
		} 
 }
public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    my m1=new my(11,"apple");
    my m2=new my(12,"hii");
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m1);
	}

}
