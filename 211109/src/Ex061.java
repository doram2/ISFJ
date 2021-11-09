
public class Ex061 {
	String name;
	int age;
	double height;
	
	//자바에서 생성자는 클래스명과 같아야한다.
//  접근지정자 클래스명(매개변수1,...): 생성자
	public Ex061(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("생성자 실행");
	}
	
	public String getName() {
		return name;
	}
	//메서드:
//  접근지정자 반환명  함수명   매개변수
	//setter
		//반환형 void: 반환할 값이 없음
	public void setName(String name) {
		this.name = name;
	}
	//반환형 int: 정수를 반환
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
