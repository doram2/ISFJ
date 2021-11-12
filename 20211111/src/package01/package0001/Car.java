package package01.package0001;

public class Car {
	int num;
	String name;
	String company;
	public Car() {};
	public Car(int num, String name, String company) {
		super();
		this.num = num;
		this.name = name;
		this.company = company;
	}
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
