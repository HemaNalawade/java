package myJava;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {//may throw exception..
    	int num =99/5;
    	System.out.println(num);//wrong in try block then print catch..
    }catch(Exception e) {//handle exception..
    	System.out.println("cannot divide by zero");
    }
	}

}
//java.lang.ArithmeticException: