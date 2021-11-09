
public class Member {
	
	int age;
	String name;
	double height;
	public Member() {}
	
	public Member(int age, double height, String name) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
	}
	public Member(int age) {
		this.age = age;
	}
	public Member(String name) {
		this.name = name;
	}
	public Member(double height) {
		this.height = height;
	}
	
	public Member(double height, int age, String name) {
		this.age = age;
		this.name = name;
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	
	
}
