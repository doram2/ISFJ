
public class Ex011Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = ex01; //ex01이 갖는값을 똑같이 가짐
		Ex01 ex03 = new Ex01(); //얜 다름
		
		ex01.first = 30;
		System.out.println(ex01.first);
		System.out.println(ex02.first);
		System.out.println(ex03.first);
		
		if(ex01 == ex02) {
			System.out.println("ex01과 ex02는 같은 객체이다.");
		}
		else {
			System.out.println("ex01과 ex02는 다른 객체이다.");
		}
		
		if(ex01 == ex03) {
			System.out.println("ex01과 ex03은 같은 객체이다.");
		}
		else {
			System.out.println("ex01과 ex03은 다른 객체이다.");
		}		//변수가 갖고 있는 주소가 같으면 같은 객체, 주소가 다르면 다른 객체
		
		//static 키워드가 있는 멤버 변수는 객체 생성 없이 클래스명으로 사용할 수 있다.
		int result = Singleton.val;
		System.out.println(result);
		
		//private은 외부 클래스에서 직접 접근 불가넝 Singleton s = Singleton.singleton;
		Singleton s = Singleton.getInstance(); // s = 30000
		Singleton s1 = Singleton.getInstance(); // s1 = 30000
		if(s == s1) System.out.println("s과 s1은 같다.");
		else System.out.println("다르다.");

	}

}
