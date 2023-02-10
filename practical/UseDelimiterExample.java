import java.util.Scanner;

public class UseDelimiterExample{
  public static void main(String args[]){
   
   Scanner sc=new Scanner("Jay is a good boy");
   sc.useDelimiter("is");
       while(sc.hasNext()){
          System.out.println(sc.next());
		  }
   
    Scanner s=new Scanner("Jay is /a good boy");
	s.useDelimiter("/");
       while(s.hasNext()){
          System.out.println(s.next());
		  }
   
   Scanner c=new Scanner("Jay is a good boy");
   c.useDelimiter("\\s");
       while(c.hasNext()){
           System.out.println(c.next());
		   }
  }
}
