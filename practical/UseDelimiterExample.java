import java.util.Scanner;
//Delimiter method is use to seperated..
public class UseDelimiterExample{
  public static void main(String args[]){
   //String s="Jay is a good boy";
   Scanner sc=new Scanner("Jay is a good boy");
   sc.useDelimiter("is");//find word and then run seperate line..
       while(sc.hasNext()){
          System.out.println(sc.next());
		  }
   
    Scanner s=new Scanner("Jay is /a good boy");
	s.useDelimiter("/");
       while(s.hasNext()){
          System.out.println(s.next());
		  }
   
   Scanner c=new Scanner("Jay is a good boy");
   c.useDelimiter("\\s");//using for space(\\)
       while(c.hasNext()){
           System.out.println(c.next());
		   }
  }
}