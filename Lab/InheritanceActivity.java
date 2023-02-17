// This is super class or base class..
class Employee {
	//Instance variables of the class..
	 long employeeId;
	 String employeeName;
	 String employeeAddress;
	 long employeePhone;
	 double basicSalary;
	 double specialAllowance = 250.80;
	 double hra = 1000.50;
   Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone)
   //This is a Parameterized Constructor..
   {
		this.employeeId=employeeId;
	    this.employeeName=employeeName;
	    this.employeeAddress=employeeAddress;
	    this.employeePhone=employeePhone;
	}
	public void calculateSalary ()//Create a method calculateSalary..
	{	
		double salary = basicSalary + (basicSalary * specialAllowance/100) + basicSalary * hra/100;		               
		System.out.println(salary);
	}
	public void calculateTransportAllowance () //Create a method calculateTransportAllowance..
	{
		double transportAllowance = 10/100*basicSalary;	
		System.out.println(transportAllowance);
	}
	
}
//This is sub class..
class Manager extends Employee{
	 Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary)
	 //This is a Parameterized Constructor..
	 {
		 super(employeeId, employeeName, employeeAddress, employeePhone);
		 this.employeeId=employeeId;
	     this.employeeName=employeeName;
	     this.employeeAddress=employeeAddress;
	     this.employeePhone=employeePhone;
		 this.basicSalary=basicSalary;
	}
	public void calculateTransportAllowance () 
	{
	  double transportAllowance = 15 * basicSalary/100;
	  
		System.out.println(transportAllowance);//manager transport allowance...
	}
}
class Trainee extends Employee{
    Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary)
	//This is a Parameterized Constructor..
	{
		 super(employeeId, employeeName, employeeAddress, employeePhone);
		 this.employeeId=employeeId;
	     this.employeeName=employeeName;
	     this.employeeAddress=employeeAddress;
	     this.employeePhone=employeePhone;
		 this.basicSalary=basicSalary;
	}
	public void calculateTransportAllowance() 
	{
		double transportAllowance = 10* basicSalary/100;
		System.out.println(transportAllowance);//trainee transport allowance.. 
	}
}
class InheritanceActivity{
	
    public static void main(String args[]){
     // Create a Manager object.
	Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);
	m.calculateSalary();
	m.calculateTransportAllowance();
	// Create a Trainee object
	Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
	t.calculateSalary();
	t.calculateTransportAllowance();
	
	}
}