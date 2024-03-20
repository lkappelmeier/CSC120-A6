/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {
  private boolean hasDiningRoom;
  private boolean hasElevator;
  private ArrayList<String> residents; 
  private int nResidents;
  private String resident;
  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean hasElevator) {
    super(name, address, nFloors);
    this.hasDiningRoom = hasDiningRoom;
    this.hasElevator = hasElevator;
    this.residents = new ArrayList<String>();
  }

  public boolean getElevator(){
    return hasElevator;
  }
  public int getNResidents(){
    return nResidents;
  }
  public String getResident(){
    return resident;
  }
 public String toString(){
  String desc = super.toString();
  if (this.hasDiningRoom){
    desc+= " It has a dining room.";
  }
  return desc;
 }
/**
 * moves in a resident
 * @param resident
 */
public void moveIn(String resident){
residents.add(resident);
}
/**
 * moves out a resident, returns resident
 * @param resident
 * @return
 */
public String moveOut(String resident){
  residents.remove(resident);
  return resident;
}
/**
 * checks if resident is in house, returns boolean
 * @param resident
 * @return
 */
public boolean isResident(String resident){
  
  if (residents.contains(resident)) {
    System.out.println(resident + " is a resident");
  } else {
    System.out.println(resident + " is not a residnet");
  }
  return residents.contains(resident);
}
  public static void main(String[] args) {
    House h = new House("Morris House", "101 Green Street in NoHo", 4, false, false);
    System.out.println(h);
  }

}