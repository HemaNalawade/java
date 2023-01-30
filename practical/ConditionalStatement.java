import java.util.Scanner;
class ConditionalStatement{
        public void calc(int num1,int num2){
            
              if(num1 > num2){
                System.out.println("Num1 is greater than Num2..");
}
              else{
                System.out.println("Num1 is not greater than Num2..");
}
}
        public static void main(String args[]){
		    Scanner s=new Scanner(System.in);
            System.out.println("The number 1:");
            int num1=s.nextInt();
			System.out.println("The number 2:");
            int num2=s.nextInt();
                ConditionalStatement obj = new ConditionalStatement();
                obj.calc(num1,num2);
}
}