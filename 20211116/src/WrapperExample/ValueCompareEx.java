package WrapperExample;

public class ValueCompareEx {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 10;
		Integer i3;
		Integer i4;
		
		if(i1 == i2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		//unboxing
		i3 = 10;
		i4 = 10;
		if(i3 == i4) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		System.out.println(i3 == i4); //true
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));

		i3 = 300;
		i4 = 300;
		System.out.println(i3 == i4); //false: -128보다 작거나 127보다 큰 경우는 false -> 비교할 수 없어서 웬만하면 사용x
		System.out.println(i3.intValue() == i4.intValue());
		System.out.println(i3.equals(i4));
	}

}
