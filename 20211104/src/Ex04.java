
public class Ex04 {

	public static void main(String[] args) {
		//실수형 리터럴: 0.5, 10.6, 0.0
		float f; //4바이트: 정밀도 낮음
		double d; //8바이트: 정밀도 높다
		//실수의 기본 크기는 8바이트
		d = 0.1234567890123456789;
		f = 0.1234567890123456789f;
		System.out.println(d);
		System.out.println(f);
		boolean b = true;
		System.out.println(b);
	}

}
