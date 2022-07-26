import java.util.*;
public class TestWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WatchPerson person1 = new WatchPerson("Sam", 55, "Human");
		person1.setUndead(false);
		WatchPerson person2 = new WatchPerson("Carrot", 30, "Human");
		person2.setUndead(false);
		WatchPerson person3 = new WatchPerson("Reginald", 100, "Human");
		person3.setUndead(true);
		WatchPerson person4 = new WatchPerson("Detritus", 75, "Troll");
		person4.setUndead(false);
		WatchPerson person5 = new WatchPerson("Mark", 35, "Dwarf");
		person5.setUndead(true);
		WatchPerson person6 = new WatchPerson("John", 250, "Werewolf");
		person6.setUndead(true);
		WatchPerson person7 = new WatchPerson("Rob", 40, "Werewolf");
		person7.setUndead(false);
		WatchPerson person8 = new WatchPerson("Omar", 25, "Dwarf");
		person8.setUndead(false);
		WatchPerson person9 = new WatchPerson("Roger", 1000, "Troll");
		person9.setUndead(true);
		
		Officer officer1 = (Officer) person1;
		officer1.setRank("Commander");
		officer1.setSalary(100);
		Officer officer2 = (Officer) person2;
		officer2.setRank("Captain");
		officer2.setSalary(50);
		
		Constable constable1 = (Constable) person3;
		constable1.setWeapon("Mace");
		Constable constable2 = (Constable) person4;
		constable2.setWeapon("Fist");
		Constable constable3 = (Constable) person5;
		constable3.setWeapon("Pointed Stick");
		Constable constable4 = (Constable) person6;
		constable4.setWeapon("Teeth");
		Constable constable5 = (Constable) person7;
		constable5.setWeapon("Sword");
		Constable constable6 = (Constable) person8;
		constable6.setWeapon("Knife");
		Constable constable7 = (Constable) person9;
		constable7.setWeapon("Harsh Language");
		
		NightWatch watchPeople = new NightWatch();
		watchPeople.detailsOfMembers();
	}

}
