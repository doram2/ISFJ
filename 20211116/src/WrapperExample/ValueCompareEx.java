package WrapperExample;

public class ValueCompareEx {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 10;
		Integer i3;
		Integer i4;
		
		if(i1 == i2) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		
		//unboxing
		i3 = 10;
		i4 = 10;
		if(i3 == i4) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		System.out.println(i3 == i4); //true
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));

		i3 = 300;
		i4 = 300;
		System.out.println(i3 == i4); //false: -128���� �۰ų� 127���� ū ���� false -> ���� �� ��� �����ϸ� ���x
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));
	}

}
