
public class Ex061 {
	String name;
	int age;
	double height;
	
	//�ڹٿ��� �����ڴ� Ŭ������� ���ƾ��Ѵ�.
//  ���������� Ŭ������(�Ű�����1,...): ������
	public Ex061(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("������ ����");
	}
	
	public String getName() {
		return name;
	}
	//�޼���:
//  ���������� ��ȯ��  �Լ���   �Ű�����
	//setter
		//��ȯ�� void: ��ȯ�� ���� ����
	public void setName(String name) {
		this.name = name;
	}
	//��ȯ�� int: ������ ��ȯ
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
