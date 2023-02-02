//Write a program to print even, odd, sum of natural number using for loop from 1-200
class NaturalNumber{
	int num=200,i=1,sum=0;
	
	//Print EvenNumber..
    public void evenNumber(){
		System.out.println("------list of Even number :  "+num);
		for(int i=1;i<num;i++)
		{
			if(i%2==0){
				System.out.print(i+" ");} 		
	}
	}
	//Print OddNumber..
	public void oddNumber(){
	   
		System.out.print("\n");
		System.out.println("------list of Odd number :  "+num);
		for(int i=1;i<=num;i++){
			if(i%2!=0){
			System.out.print(i+" ");
			}			
			}
	}
	//Print NaturalNumber..
	public void sumOfNaturalNumber(){
	   while(i<=num){
	   sum=sum+i;
	   i++;
	   }
	   System.out.print("\n");
	   {
	   System.out.print("------sum of 1 to 200 :  "+sum);
	   }
	}
	public static void main(String args[]){
	NaturalNumber n=new NaturalNumber();
	n.evenNumber();
	n.oddNumber();
	n.sumOfNaturalNumber();
	}
}