import java.util.Scanner;
class SwitchExample{
    public void calc(int fruit){
	    switch(fruit){
		case 1 :
		System.out.println("Mango");
		break;
		case 2 :
		System.out.println("Apple");
		break;
		case 3 :
		System.out.println("Grapes");
		break;
		case 4 :
		System.out.println("Orange");
		break;
		case 5 :
		System.out.println("Cherry");
		break;
		case 6 :
		System.out.println("Banana");
		break;
		case 7 :
		System.out.println("Pineapple");
		break;
		default:
		System.out.println("Sorry..Please try another number");
	}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int fruit=sc.nextInt();
		
		SwitchExample se=new SwitchExample();
		se.calc(fruit);
	}
	

}