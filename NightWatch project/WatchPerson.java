
public class WatchPerson {

	private String name;
	private int age;
	private String race;
	private boolean undead;
	
	public WatchPerson(String name, int age, String race) {
		this.name = name;
		this.age = age;
		this.race = race;
		this.undead = true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isUndead() {
		return undead;
	}

	public void setUndead(boolean undead) {
		this.undead = undead;
	}

	@Override
	public String toString() {
		return "WatchPerson [getName()=" + getName() + ", getAge()=" + getAge() + ", getRace()=" + getRace()
				+ ", isUndead()=" + isUndead() + "]";
	}
	
}
