
public class Ex02 {

	public static void main(String[] args) {
		byte b;
		b = -128;
		System.out.println(b);
		b = 127;
		System.out.println(b);
		//b = -129
		//b = 128
		char ch = 0; //unicode: 정수에 해당하는 문자는 무엇인가?
		System.out.println(ch);
		ch = 65535;
		System.out.println(ch);
		ch = 65;
		System.out.println(ch);
		ch = 97;
		System.out.println(ch);
		ch = 'A'+32;
		System.out.println(ch);
		ch = '가';
		System.out.println((int)ch);
		short sh = -32768;
		System.out.println(sh);
		sh = 32767;
		System.out.println(sh);
		int i = -2147483648;
		System.out.println(i);
		
		float f;
		f = 3.4f;
		System.out.println("f:"+f);
		double d = 3.4;
		System.out.println("d:"+d);
		
		long l = 10;
		System.out.println(l);
		l = 2147483647000l;
		System.out.println(l);
		//정수의 기본크기는 4바이트
		//실수의 기본크기는 8바이트
	
	}

}
