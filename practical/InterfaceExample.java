interface Sports{//parent1
    public void homeTeam(String name);
	public void team(int noOfPlayers);
}
interface Event{//parent2
   public void eventName(String ename);
   public void eventDate(String edate);
   public void eventPlace(String place);
}
class FootBall implements Sports{
    public void homeTeam(String name)
	{
	name="Pune";
	System.out.println("our team is representing" +name);
	}
	public void team(int noOfPlayers){
	noOfPlayers=11;
	System.out.println("Total no of players" +noOfPlayers);
	}
	public void goals(int score){
	  System.out.println("Total no of score "+score);
	}
	public void eventName(String ename){
	  System.out.println("Event company name "+ename);
	}
   public void eventDate(String edate){
	   System.out.println("Event date"+edate);
   }
   public void eventPlace(String place){
	   System.out.println("Event place "+place);
   }
}
class InterfaceExample{//create Interface Example..
  public static void main(String args[]){
   FootBall b =new FootBall();
   b.homeTeam("Maharastra");
   b.team(11);
   b.goal(2);
   b.eventName("FIFA");
   b.eventDate("1st mar 2023");
   b.eventPlace("USA");
  }
}
