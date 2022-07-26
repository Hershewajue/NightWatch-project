import java.util.*;

public class NightWatch {
	ArrayList<WatchPerson> watchPeople;

	public NightWatch() {
		watchPeople = new ArrayList<WatchPerson>();
	}

	public ArrayList<WatchPerson> getWatchPeople() {
		return watchPeople;
	}

	public void setWatchPeople(ArrayList<WatchPerson> watchPeople) {
		this.watchPeople = watchPeople;
	}

	public void addWatchPerson(WatchPerson newMember) {
		if (!watchPeople.contains(newMember)) {
			watchPeople.add(newMember);
			System.out.println("New member was added to NightWatch!");
		} else
			System.out.println("The person is already a member of the NightWatch!");
	}

	public void removeWatchPerson(WatchPerson dismissed) {
		if (watchPeople.contains(dismissed)) {
			watchPeople.remove(dismissed);
			System.out.println("This person has been removed from NightWatch!");
		} else
			System.out.println("The person is not a member of the NightWatch!");
	}

	public String detailsOfMembers() {
		String details = "";
		for (WatchPerson person : watchPeople) {
			details += person.toString();
			details += "\n";
		}
		return details;
	}

	public void printDetailsOfMembers() {
		System.out.println(detailsOfMembers());
	}
	
	public ArrayList<WatchPerson> listBasedOnRace(String race){
		ArrayList<WatchPerson> list = new ArrayList<WatchPerson>();
		for(WatchPerson person : watchPeople) {
			if(person.getRace().equals(race)) {
				list.add(person);
			}
		}
		return list;
	}
	public ArrayList<WatchPerson> listBasedOnAge(int age){
		ArrayList<WatchPerson> list = new ArrayList<WatchPerson>();
		for(WatchPerson person : watchPeople) {
			if(person.getAge() > age) {
				list.add(person);
			}
		}
		return list;
	}
	public ArrayList<WatchPerson> listBasedOnUndead(boolean undead){
		ArrayList<WatchPerson> list = new ArrayList<WatchPerson>();
		for(WatchPerson person : watchPeople) {
			if(person.isUndead()) {
				list.add(person);
			}
		}
		return list;
	}
}
