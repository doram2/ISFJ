
public class Ex01Test {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		
		double d = 10.5;
		System.out.println(d);
		
		int[] ii = new int[3];
		ii[0] = 10;
		ii[1] = 20;
		System.out.println(ii[0]);
		System.out.println(ii[1]);
		
		Ex01 ex01 = new Ex01(); //ex01 		| radius | pi |
		ex01.radius = 10;
		ex01.pi =3.141592;
		double result = ex01.areaCircle();
		System.out.println(result);
		System.out.println(ex01.getRadius());//����ʵ忡 ���� �����ϴ°��� ��ȣ��������
	
		Ex01 ex011 = new Ex01();
		ex011.radius = 20;
		
		
		int[] i001 = new int[3];
		double[] d0001 = new double[3];
		Ex01[] ex001 = new Ex01[3]; //�Ϲ� �迭 �����̶� �Ȱ��� Ŭ���� �迭 ���� ����
		
		i001[0] = 10;
		d0001[0] = 10.5;
		ex001[0] = new Ex01();
	}

}
