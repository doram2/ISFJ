
public class Ex01Test {

	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		Ex01 ex02 = new Ex01();
	
		if(ex01 == ex02) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		
		ex01.first = 20;
		System.out.println(ex02.first);
		System.out.println(ex01.first);

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("����");
		}
		else System.out.println("�ٸ���");
	}

}
