package WrapperExample;

public class IntegerWrapperEx {

	public static void main(String[] args) {
		int i = 10;
		String s = "10";
		
		Integer i1 = 10; //int wrapper class
		i = Integer.parseInt(s); //문자열값을 숫자로 저장할 수 있도록 만든 클래스
		
		byte by = 10;
		Byte by1 = 10; //byte wrapper class
		
		short sh = 10;
		Short sh1 = 10; //short wrapper class
		
		double d = 10.5;
		Double d1 = 10.5; //double wrapper class
		
		float f = 10.5f;
		Float f1 = 10.5f; //float wrapper class
		
		//f = null; null: 값은 존재하지만 어떤 값인지는 모름
		f1 = null; // wrapper class: null값을 저장할 때 주로 사용

	}

}
