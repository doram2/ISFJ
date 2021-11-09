
public class Ex11 {
	String company;
	String model;
	String color;
	int maxSpeed;
	
	public Ex11() {}

	public Ex11(String company, String model, String color, int maxSpeed) {
		this(company, model);
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Ex11(String company, String model, String color) {
		this(company, model);
		this.color = color;
	}
	public Ex11(String company, String model, int maxSpeed) {
		this(company, model);
		this.maxSpeed = maxSpeed;
	}
	
	//공통코드를 관리하는 생성자
	public Ex11(String company, String model) {
		this.company = company;
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

	public void setModel(String mode) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
}
