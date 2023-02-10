enum TrafficSignal{
  RED("Stop"),
  GREEN("Go"),
  YELLOW("SlowDown");
  String action;
  
  public String getAction(){
    return action;
  }
  TrafficSignal(String action){
    this.action=action;
  }
  
}
public class TestEnum{
  public static void main(String args[]){
   TrafficSignal t=TrafficSignal.YELLOW;
   System.out.println(t.getAction());
  }
}