
public class Ex03 extends Ex02{

	String subject;
	public Ex03(int radius, double pi, String subject) {
		super(radius, pi);
		this.subject = subject;
	} //�ڽ� Ŭ����

	@Override
	public double area() {//������
		return radius*radius*Math.PI;
	}
	public double area(double p) {//�����ε�
		return radius*radius*p;
	}
	public double area1() {
		return super.area();
	}
	
	
}
