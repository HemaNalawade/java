class Owner{//super
	int area=1000;
	String dateofpurchase="23-05-2000";
	String name="Sam";
	boolean noc=true;

	public void renew(){
		String color="blue";
		String flat="2bhk";
		int ceilheight=8;

		System.out.println(color+" "+flat +" "+ceilheight);
}
}

class New_owner extends Owner//sub // single inheritance
{
	String dateofRegister="3-2-2023";
	double flatvalue=2.5000000;
	String name="Jay";

    public void display(){
		System.out.println("Area is :"+area);// parent property
		System.out.println("name :"+super.name);// use of super keyword to acces the parent property
		System.out.println("price :"+flatvalue);
		System.out.println("new name :"+name);
		}

public void renew(){// method overriding 
		String color="oftwhite";
		String flat="3bhk";
		int ceilheight=10;

		System.out.println(color+" "+flat +" "+ceilheight); 
		}
}
class ThirdOwner extends New_owner{ //Multiple inheritance

	
	
	String name="Suraj";
	
	public void display(){
		//System.out.println("Area is :"+area);// parent property
		//System.out.println("name :"+super.name);// use of super
		//System.out.println("price :"+flatvalue);
		System.out.println("new name :"+name);
		}

	public void renew(){
		String color="pink";
		String flat="5bhk";
		int ceilheight=11;

		System.out.println(color+" "+flat +" "+ceilheight);
	}
}

class SecondOwner extends Owner{ //herirchical inheritance

	
	
	String name="Rani";
	
	public void display(){
		//System.out.println("Area is :"+area);// parent property
		//System.out.println("name :"+super.name);// use of super
		//System.out.println("price :"+flatvalue);
		System.out.println("new name :"+name);
		}

	public void renew(){
		String color="Red";
		String flat="3bhk";
		int ceilheight=6;

		System.out.println(color+" "+flat +" "+ceilheight);
	}
}
class InheritanceExample{
	public static void main(String[] args){
		New_owner c=new New_owner();// child obj
		c.display();
		c.renew();//invoke child
		SecondOwner a=new SecondOwner();
		New_owner b=new ThirdOwner();
		b.display();
		b.renew();
		
		a.display();
		a.renew();
	
	}

}