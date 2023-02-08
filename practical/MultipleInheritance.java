interface Parent1
{
   void discipline();
   
}
interface Parent2
{
   void discipline();
}
class Child implements Parent1,Parent2
{
 public void discipline()
   {
      System.out.println("I am learning discipline from my parent..");
   }
   void follow()
   {
      System.out.println("I am follwoing all the instructions..");
   }
 }
 public class MultipleInheritance{
    public static void main(String args[]){
	 Child c=new Child();
	 c.discipline();
	 c.follow();
	}
 }