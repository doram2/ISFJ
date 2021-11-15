package default_method;

public class ClassC extends ClassA{
	public void method04() {
		System.out.println("ClassC-method04");
	}
	@Override
	public void method01() {
		System.out.println("ClassC-method01");
		
	}
	@Override
	public void method02() {
		System.out.println("ClassC-method02");
	}
}
