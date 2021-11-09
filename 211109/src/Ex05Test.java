
public class Ex05Test {

	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		//private로 선언된 멤버에 직접 접근할 수 없다. 멤버의 은닉
		//ex05.age = 20;
		//ex05.height = 170.9;

		ex05.setAge(30);
		ex05.setHeight(160.7);
		
		//값도 직접 가져올 수 없다.
		//System.out.println(ex05.age);
		
		System.out.println(ex05.getAge());
		
		ex05.name = "김일이"; // 외부에서 직접 접근할 수 있음
		
		System.out.println(ex05.name);
	}

}
