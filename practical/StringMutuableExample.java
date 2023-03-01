package myJava;

public class StringMutuableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    StringBuffer s1=new StringBuffer("Anudip");
    System.out.println(s1.append(" vashi "));
    System.out.println(s1);
    System.out.println(s1.insert(6,"NGO"));
    System.out.println(s1.replace(6,10,"Java"));
    System.out.println(s1.delete(0, 2));
    StringBuffer s2=new StringBuffer("Anudeep Foundation");
    System.out.println(s2.delete(0, 2));
    System.out.println(s2.reverse());
    System.out.println(s2.length());
    System.out.println(s2.substring(0,1).toUpperCase());
	}
	

}
