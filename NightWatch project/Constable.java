
public class Constable extends WatchPerson{
	private String weapon;
	
	public Constable(String name, int age, String race, String weapon) {
		super(name, age, race);
		this.weapon = weapon;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Constable [getWeapon()=" + getWeapon() + ", toString()=" + super.toString() + "]";
	}
	
}
