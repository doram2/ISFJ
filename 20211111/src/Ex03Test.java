
public class Ex03Test {

	public static void main(String[] args) {
		System.out.println(Ex03.name);
		Ex03.name = "김일이";
		System.out.println(Ex03.name);
		//final 변수는 객체마다 값을 초기화 할 수 있다. 단, 한 번 초기화를 하면 변경 할 수 없다.
		Ex03 ex03 = new Ex03(20, 30);
		Ex03 ex031 = new Ex03(50, 20);
		System.out.println(ex03.getVal1());
		System.out.println(ex031.getVal1());
		
		//상수를 사용하는 이유는 모든 객체에서 변경되지 않는 동일한 값을 사용하기 위함
		System.out.println("=======");
		System.out.println(Ex03.first);
		System.out.println(Ex03.second);
		System.out.println(ex03.first);
		System.out.println(ex03.second);
		System.out.println(ex031.first);
		System.out.println(ex031.second);
		
	}

}
