
public class Ex05 {

	public static void main(String[] args) {
		//형변환
		//자동형변환: 작은 자료형을 큰 자료형으로 변환하는것
		//1byte -> 2byte -> 4byte -> 8byte
		//1byte -> 8byte, 1 byte -> 4byte
		short sh = 30000;
		int i = sh; //자동형변환 정수 -> 실수
		float f = sh;
		System.out.println("i: "+i);
		System.out.println("f: "+f);
		double d = sh;
		System.out.println("d: "+d);
		
		//강제형변환: 큰 자료형을 작은 자료형으로 변환하는것
		//실수 -> 정수, 큰형 -> 작은형
		double d1 = 174.3;
		float f1 = 174.5f;
		int i1 = (int)f1; //소숫점 이하 탈락
		System.out.println(i1);
		
		i1 = (int)d1; //실수 - > 정수
		System.out.println(i1);
		
		int i2 = 2100000000;
		short sh1 = (short)i2; //큰 형 -> 작은형
		System.out.println(sh1);
		//overflow발생. 숫자가 달라진다
		
		int i3 = 32000;
		short sh3 = (short)i3; //32000은 short에 담을 수 있는 크기이므로 오버플로우가 발생하지 않는다.
		System.out.println(sh3);
	}

}
