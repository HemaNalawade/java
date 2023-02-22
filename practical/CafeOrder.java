//we need to create a cafe ordering program, and we need to use arrays to do so...
package myJava;
import java.util.Scanner;
public class CafeOrder {
	public void Coffee() {
		String []CoffeeItems= {"ColdCoffee","HotCoffee","CoffeeWithCrush","ChocolateCoffee"};
		 System.out.println("******Order Coffee******");
	    for(int i=0;i<CoffeeItems.length;i++) {
	    	System.out.println(CoffeeItems[i]);
	    }
	    Scanner s =new Scanner(System.in);
	    System.out.println("please enter your order:");
	    int Input=s.nextInt();
	    switch(Input){
	    case 1:
	    	System.out.println("Thanks for order: "+CoffeeItems[0]);
	    	break;
	    case 2:
	    	System.out.println("Thanks for order: "+CoffeeItems[1]);
	    	break;
	    case 3:
	    	System.out.println("Thanks for order: "+CoffeeItems[2]);
	    	break;
	    case 4:
	    	System.out.println("Thanks for order: "+CoffeeItems[3]);
	    	break;
	    	default:
	    		System.out.println("Invalid");
	    		break;
	    }
	}
	 public void Dessert() {
		 String []DessertItems= {"FruitSalad","StraberryIceCream","PanCake","Waffle"};
		 System.out.println("******Order Dessert******");
	     for(int i=0;i<DessertItems.length;i++) {
	    	 System.out.println(DessertItems[i]);
	     }
	     Scanner sc =new Scanner(System.in);
		    System.out.println("please enter your order:");
		    int Input=sc.nextInt();
		    switch(Input){
		    case 1:
		    	System.out.println("Thanks for order: "+DessertItems[0]);
		    	break;
		    case 2:
		    	System.out.println("Thanks for order: "+DessertItems[1]);
		    	break;
		    case 3:
		    	System.out.println("Thanks for order: "+DessertItems[2]);
		    	break;
		    case 4:
		    	System.out.println("Thanks for order: "+DessertItems[3]);
		    	break;
		    	default:
		    		System.out.println("Invalid");
		    		break;
		    }
	 }
	 public void Mocktails() {
		 String []MocktailsItems= {"Virgin Margarita","DeepBlue","Virgin Mojito","Blackberry Mojito"};
		 System.out.println("******Order Mocktails******");
	     for(int i=0;i<MocktailsItems.length;i++) {
	    	 System.out.println(MocktailsItems[i]);
	     }
	     Scanner sc =new Scanner(System.in);
		    System.out.println("please enter your order:");
		    int Input=sc.nextInt();
		    switch(Input){
		    case 1:
		    	System.out.println("Thanks for order: "+MocktailsItems[0]);
		    	break;
		    case 2:
		    	System.out.println("Thanks for order: "+MocktailsItems[1]);
		    	break;
		    case 3:
		    	System.out.println("Thanks for order: "+MocktailsItems[2]);
		    	break;
		    case 4:
		    	System.out.println("Thanks for order: "+MocktailsItems[3]);
		    	break;
		    	default:
		    		System.out.println("Invalid");
		    		break;
		    }
	 }
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub    
     CafeOrder c=new CafeOrder();
     c.Coffee();
     c.Dessert();
     c.Mocktails();
	}

}
