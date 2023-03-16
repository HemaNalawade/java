package myJava;

public class TaxCalculator {//define the TaxCalculator Class...
	public static double calculateTax ( String empName,boolean isIndian,double empSal)throws Exception {
	if (!isIndian)throw new CountryNotValidException();
	if(empName== null|| empName.isEmpty())throw new EmployeeNameInvalidException();//check employee name is null or empty...
	double taxAmount;
	if(empSal>100000 && isIndian==true) //check empSal is greater than 100000 and isIndian true or not..
		return taxAmount=empSal*8/100;//return tax amount value..
	else if(empSal>=50000 && empSal<=100000  && isIndian==true)//check condition is true or not is between 500000 and 1100000.. 
		return taxAmount=empSal*6/100;
	else if(empSal>=30000 && empSal<=100000  && isIndian==true) //check condition is true or not is between 30000 and 50000.. 
		return taxAmount=empSal*5/100;
	else if(empSal>=10000 && empSal<=30000  && isIndian==true) //check condition is true or not is between 10000 and 30000.. 
		return taxAmount=empSal*4/100;
	else 
		throw new TaxNotEligibleException();//throw  TaxNotEligibleException..
	}
}

@SuppressWarnings("serial")
class CountryNotValidException extends Exception{//Exception class for CountryNotValidException..

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The employee should be an Indian citizen for calculating tax..";//Return the message..
	}
	
	
}
@SuppressWarnings("serial")
class EmployeeNameInvalidException extends Exception{//Exception class for EmployeeNameInvalidException..

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The employee name cannot be empty";//Return the message..
	}
	
}
@SuppressWarnings("serial")
class TaxNotEligibleException extends Exception {//Exception class for TaxNotEligibleException..

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return"The employee does not need to pay tax";//Return the message..
	}

}
