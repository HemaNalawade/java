package myJava;

public class StringEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String a1="Anudip";
      String a2="Anudip Foundation";
      String a3="Anudip";
      System.out.println(a1.equals(a2));//compare values of string..
      System.out.println(a1.equals(a3));
      System.out.println(a1.equalsIgnoreCase(a3));
      
      //==compaers references not values..
      System.out.println(a1==a2);//false
      System.out.println(a1==a3);//true
      String a5="apple";
      String a6="america";
      System.out.println(a6.compareTo(a5));//a5<a6=Negative number..
      System.out.println(a1.compareTo(a3));//equals..
      System.out.println(a5.compareTo(a6));//a5>a6=positive number..
	}

}
