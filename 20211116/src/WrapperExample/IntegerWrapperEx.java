package WrapperExample;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		int i = 10;
		String s = "10";
		
		Integer i1 = 10; //int wrapper class
		i = Integer.parseInt(s); //���ڿ����� ���ڷ� ������ �� �ֵ��� ���� Ŭ����
		
		byte by = 10;
		Byte by1 = 10; //byte wrapper class
		
		short sh = 10;
		Short sh1 = 10; //short wrapper class
		
		double d = 10.5;
		Double d1 = 10.5; //double wrapper class
		
		float f = 10.5f;
		Float f1 = 10.5f; //float wrapper class
		
		//f = null; null: ���� ���������� � �������� ��
		f1 = null; // wrapper class: null���� ������ �� �ַ� ���

	}

}
