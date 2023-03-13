package myJava;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add some color names
		  ArrayList<String>preColorList= new ArrayList<>();
		  preColorList.add("Brown");
		   preColorList.add("Voilet");
		  
   ArrayList<String>colorList= new ArrayList<>();//obj creation..
   colorList.add("Red");
   colorList.add("Black");
   colorList.add("Blue");
   colorList.add("Pink");
   colorList.add("Yellow");
   colorList.addAll(preColorList);
   colorList.add(0,"Gray");//add value in position(positionValue,name)..
   System.out.println(colorList);
		
	}
	

}
/* ArrayList intergerCollection =new ArrayList<>();
intergerCollection.add(23);
intergerCollection.add("shyj");
System.out.println(intergerCollection);*/