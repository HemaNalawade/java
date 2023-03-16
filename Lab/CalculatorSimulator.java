package myJava;

public class CalculatorSimulator {//Define a main CalculatorSimulator  class..

	
	public static void main(String[] args) {//Define main method..
		// TODO Auto-generated method stub
        TaxCalculator obj=new TaxCalculator();//Create a object for the TaxCalculator Class..
        System.out.println("Test case 1 :");
        try {
        	double taxAmount =obj.calculateTax("Ron", false, 34000);//Condition is right then tax amount will print..
        	System.out.println("Tax amount is "+taxAmount);//Display the amount of tax..
        }catch(Exception e) {//Exception throw..
        	System.out.println(e.getMessage());//print The employee should be an Indian citizen for calculating tax.
        }
        System.out.println("Test case 2 :");
        try {
        	double taxAmount =obj.calculateTax("Tim",true,1000);//Condition is right then tax amount will print..
        	System.out.println("Tax amount is "+taxAmount);//Display the amount of tax..
        }catch(Exception e) {//Exception throw..
        	System.out.println(e.getMessage());//print The employee does not need to pay tax
        }
        System.out.println("Test case 3 :");
        try {
        	double taxAmount =obj.calculateTax("Jack",true,55000);//Condition is right then tax amount will print..
        	System.out.println("Tax amount is "+taxAmount);//Display the amount of tax..
        }catch(Exception e) {//Exception throw..
        	System.out.println(e.getMessage());//print Tax amount is 3300
        }
        System.out.println("Test case 4 :");
        try {
        	double taxAmount =obj.calculateTax("",true,30000);//Condition is right then tax amount will print..
        	System.out.println("Tax amount is "+taxAmount);//Display the amount of tax..
        }catch(Exception e) {//Exception throw..
        	System.out.println(e.getMessage());//Print The employee name cannot be empty.
        }
	}

}
