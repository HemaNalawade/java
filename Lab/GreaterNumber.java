//Write a program to Print numbers from 1-100, which are divisible by 5,and if the number is greater than 40.
class GreaterNumber{
	
   public void cal(){
   System.out.println("Divided by 5: ");
		for (int i=1; i<100; i++) //for(initialization;condition;inc/dec)
		{
			if (i%5==0 && i>40)
			System.out.print(i +", ");
            
			}
			System.out.print(" ");	
   }
        public static void main(String args[])
			{
	         GreaterNumber g=new GreaterNumber();
			 // classname objname=new classname();
			 g.cal();// call method
   }
   }