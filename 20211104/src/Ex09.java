
public class Ex09 {

	public static void main(String[] args) {
		System.out.println(true);
		boolean b = true;
		System.out.println(!b);
		System.out.println(!!b);
		boolean b1 = false;
		System.out.println(!b1);
		System.out.println(!!b1);
		//논리연산 true and true. true and false, ...
		boolean b2 = true && true;
		System.out.println(b2);
		System.out.println(true && false);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		
		//논리연산자: &&(and), ||(or)
		
		int i = 10;
		int j = 20;
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);
		
		boolean b3;
		b3 = i > j;
		System.out.println("b3: "+b3);
		
		//2200년은 윤년인가?
		System.out.println(2200%4 == 0 && 2200%100 != 0 || 2200%400 == 0);
		
		float f = 10.1f; //10.100000000
		double d = 10.1;//10.1000000000111111111
		boolean b4;
		b4 = f == d;
		System.out.println(b4);
		b4 = (double)f == d; //10.1000000000000000000
		System.out.println(b4);
		b4 = f == (float)d;
		System.out.println(b4);
		
		i = 10;
		d = 10.0;
		b4 = 1 == d;
		System.out.println(b4);
		
		int i3 = 65;
		int i4 = 75;
		int i5 = 85;
		boolean b5, b6, b7;
		b5 = i3 > i4;
		b6 = i4 < i5;
		b7 = b5 && b6;
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		
		b7 = i3 > i4 & i4 <i5;
		System.out.println(b7);
		
		b7 = b5 || b6;
		System.out.println(b7);
		b7 = i3 > i4 || i4 < i5;
		System.out.println(b7);
		
	}

}
