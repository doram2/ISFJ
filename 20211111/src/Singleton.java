
public class Singleton {
	int first;
	int second;
	static int val = 10;
	//�ڱ� �ڽ��� ��ü�� �̸� ����� ���� ���
	private static Singleton singleton = new Singleton();
//	private static 	Ŭ������	 singleton = new Ŭ������(); 
	private Singleton() {} //private�����ڸ� ���� Ŭ���� �ʿ�
	public static Singleton getInstance() { //��ü ��ȯ �޼���. �ڽ��� ��ü�� ����
		return singleton;
	}
}
