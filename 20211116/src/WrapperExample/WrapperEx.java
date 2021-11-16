package WrapperExample;

public class WrapperEx {

	public static void main(String[] args) {
		Integer i = 100; //int => Integer: boxing
		
		int i1 = i; // Integer => Int:  unboxing
		int i2 = 20;
		
		int result = i + i2;
		
		Integer i3 = new Integer(10);//
		Integer i4 = new Integer("10");//잘 사용하지 않는 방법
		Integer i5 = Integer.valueOf("300");
		Integer i6 = 10;
		
		int i7 = i6; //자동 unboxing
		i7 = i6.intValue(); //unboxing
		
		int i8 = 10;
		Integer i9 = 10;
		i9 = i8;
	}

}
