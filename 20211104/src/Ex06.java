
public class Ex06 {

	public static void main(String[] args) {
		//정수는 기본적으로 4byte
		//short sh1 = 32767;
		//short sh2 = 32767;
		//short sh3 = sh1 + sh2;  
		//			   정수 + 정수
		//			 4byte + 4byte = 4byte
		// short 연산시 자동으로 int로 형변환
		short sh4 = 10;
		short sh5 = 20;
		int sh6 = sh4 + sh5;
		System.out.println(sh6);
		
		short sh7 = (short)(sh4 + sh5);
		System.out.println(sh7);
		
		int i1 = 10;
		int i2 = 3;
		double d1 = i1 / i2;
		//		4바이트 / 4바이트 => 10 / 3 = 3
		System.out.println(d1);
		d1 = (double)i1/i2;
		//		8바이트 / 4바이트 => 8바이트 / 8바이트 자동형변환
		System.out.println(d1);
		
		float f1 = 3.5f;
		float f2 = 3.7f;
		float f3 = f1 + f2;
		System.out.println(f3);
		
		double d4 = 3.8;
		double d5 = f1 + d4;
		System.out.println(d5);
		
		double d6 = 3.5 + 4;
		System.out.println(d6);
		
		short sh = -127;
		int ss = -sh;
		System.out.println(ss);
		
		
	}

}
