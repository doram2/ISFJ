
public class Ex10 {
	//this: ����ʵ�
	//thils(): ������ ȣ��
	String company;
	String model;
	String color;
	int maxSpeed;
	public Ex10(String company, String model, int maxSpeed) {
		this(company, model);
		this.maxSpeed = maxSpeed;
	}
	public Ex10(String company, String model, String color) {
		this(company, model); //����ʵ带 �ʱ�ȭ���ִ� �����ڰ� �ִٸ�, this()�޼���� ������ ȣ��
		/*
		this.company = company;
		this.model = model;
		*/
		this.color = color;
	}
	public Ex10(String company, String model) {
		this.company = company; //this()�޼��带 ����ϱ� ���� �����ڴ� �ڵ� �Ʒ��κп� ��ġ�ؾ���
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
