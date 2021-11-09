
public class Ex14 {
	
	int result;
	int first;
	int second;
	int add; //괄호없으면 변수로 사용
	
	public Ex14(int first, int second) {
		this.first = first; //일반적으로 매개변수와 멤버필드의 이름을 같게하기 때문에 구분을 위해 this를 사용한다. ==> 일반적으로 멤버필드에는 모두 this.를 붙여 사용
		this.second = second;
	}
	//메서드의 4가지 유형
	//1. 입력값과 결과값이 모두 있는 메서드
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int div(int num1, int num2){
		return num1 / num2; 
	}
	//2. 입력값은 있고 결과값은 없는 메서드
	public void sub(double num1, int num2) {
		this.result = (int)num1 - num2; //result에는 this.를 안붙여도 되긴 한데 웬만하면 붙이는게 좋다 왜냐면 멤버필드니까
		System.out.println(result);
	}
	public int sub(int num1, double num2) { //메서드 오버로딩 - 매개변수의 순서가 다름
		return (int) (num1 - num2);
	}
	//3. 입력값은 없고 결과값은 있는 메서드
	public int mul() {
		return this.first * this.second; //내부에서 접근할 댄 this 없이 가능
	}
	//4. 입력값과 결과값이 모두 없는 메서드
	public void div() { //메서드 오버로딩
		this.result = this.first / this.second;
		System.out.println(result);
	}
}
