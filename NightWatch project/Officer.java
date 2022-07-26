
public class Officer extends WatchPerson {
	private String rank;
	private int salary;
	
	public Officer(String name, int age, String race, String rank, int salary) {
		super(name, age, race);
		this.rank = rank;
		this.salary = salary;
	}

	public String getRank() {
		return rank;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Officer [getRank()=" + getRank() + ", toString()=" + super.toString() + "]";
	}


}