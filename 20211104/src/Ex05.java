
public class Ex05 {

	public static void main(String[] args) {
		//����ȯ
		//�ڵ�����ȯ: ���� �ڷ����� ū �ڷ������� ��ȯ�ϴ°�
		//1byte -> 2byte -> 4byte -> 8byte
		//1byte -> 8byte, 1 byte -> 4byte
		short sh = 30000;
		int i = sh; //�ڵ�����ȯ ���� -> �Ǽ�
		float f = sh;
		System.out.println("i: "+i);
		System.out.println("f: "+f);
		double d = sh;
		System.out.println("d: "+d);
		
		//��������ȯ: ū �ڷ����� ���� �ڷ������� ��ȯ�ϴ°�
		//�Ǽ� -> ����, ū�� -> ������
		double d1 = 174.3;
		float f1 = 174.5f;
		int i1 = (int)f1; //�Ҽ��� ���� Ż��
		System.out.println(i1);
		
		i1 = (int)d1; //�Ǽ� - > ����
		System.out.println(i1);
		
		int i2 = 2100000000;
		short sh1 = (short)i2; //ū �� -> ������
		System.out.println(sh1);
		//overflow�߻�. ���ڰ� �޶�����
		
		int i3 = 32000;
		short sh3 = (short)i3; //32000�� short�� ���� �� �ִ� ũ���̹Ƿ� �����÷ο찡 �߻����� �ʴ´�.
		System.out.println(sh3);
	}

}
