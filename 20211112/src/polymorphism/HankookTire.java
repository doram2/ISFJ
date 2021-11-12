package polymorphism;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {//타이어가 굴러가는 메서드
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		}
		else {
			System.out.println("***" + location + " HankookTire 펑크 ***");
			return false;
		}
	}
	
	
}
