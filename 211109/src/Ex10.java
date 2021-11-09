
public class Ex10 {
	//this: 멤버필드
	//thils(): 생성자 호출
	String company;
	String model;
	String color;
	int maxSpeed;
	public Ex10(String company, String model, int maxSpeed) {
		this(company, model);
		this.maxSpeed = maxSpeed;
	}
	public Ex10(String company, String model, String color) {
		this(company, model); //멤버필드를 초기화해주는 생성자가 있다면, this()메서드로 생성자 호출
		/*
		this.company = company;
		this.model = model;
		*/
		this.color = color;
	}
	public Ex10(String company, String model) {
		this.company = company; //this()메서드를 사용하기 위한 생성자는 코드 아랫부분에 위치해야함
		this.model = model;

	}
	public String getCompany() {
		return company;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	

}
