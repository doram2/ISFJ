
public class Ex02Test {

	public static void main(String[] args) {
		int i = 10;
		//cal = calculator()
		Ex02 ex02 = new Ex02();
	//  자료형	 변수명
		ex02.addr = "인천시";
		ex02.age = 25;
		ex02.name = "김춘식";
		ex02.gender = true;
		System.out.println(ex02.addr);
		System.out.println(ex02.age);
		System.out.println(ex02.name);
		System.out.println(ex02.gender);
		
		Ex02 ex021 = new Ex02();
		ex021.addr = "인천시";
		ex021.age = 26;
		ex021.name = "김일이";
		ex021.gender = false;
		System.out.println(ex021.addr);
		System.out.println(ex021.age);
		System.out.println(ex021.name);
		System.out.println(ex021.gender);
		
		
	}

}
