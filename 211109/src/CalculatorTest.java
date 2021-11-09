
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.add(10, 20);
		System.out.println(cal.result);
		cal.sub(30, 50);
		System.out.println(cal.result);
		cal.mul(2, 30);
		System.out.println(cal.result);
		cal.div(30, 2);
		System.out.println(cal.result);
	}

}
