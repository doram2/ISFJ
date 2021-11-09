
public class Ex04 {
	//¸â¹ö ÇÊµå (== ¸â¹ö º¯¼ö)
	int age;
	double height;
	boolean gender;
	String name;
	
	public void setData(int age, double height, boolean gender, String name) {
		this.age = age;
		this.height = height;
		this.gender = gender;
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public boolean getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
}
