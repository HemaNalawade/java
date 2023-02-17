package myPract;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int myarray[]=new int[4];//declaration and instantiation
     myarray[0]=78;//initialization
     myarray[1]=97;
     myarray[2]=76;
     myarray[3]=30;
      
     System.out.println(myarray[2]);//value at index2
     for(int i=0;i<myarray.length;i++) {//length array
    	 System.out.println(myarray[i]);
     }
     float num[]= {3.3f,5.5f,8.3f,9.8f};
	 System.out.println("Array element :");
	 for(float j:num) {
		 System.out.print(j+",");
	 }
	}
	

}
