
public class Ex13 {

	public static void main(String[] args) {
		//90~ A 80~ B 70~ C 60~ D else F
		int score = 75;
		
		if(score >= 90) {
			System.out.println("A");
		}
		else if(score >= 80) {
			System.out.println("B");
		}
		else if(score >= 70) {
			System.out.println("C");
		}
		else if(score >= 60) {
			System.out.println("D");
		}
		
		System.out.println("=====================================");
		//95이상이면 A+, 85이상이면 B+,...
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+");
			}
			else {
				System.out.println("A");
			}
		}
		//...
		
	}


}
