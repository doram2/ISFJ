
public class Ex01 {

	public static void main(String[] args) {
		// 변수 값을 10개 저장 -> 변수를 10개 만드는게 아니고 변수 하나에 10개의 값을 저장하도록 만든다 = 배열
		
		int[] score = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(score[5]);
		
		//Python의 리스트는 여러 유형의 데이터를 여러개 저장할 수 있지만, JAVA의 배열은 정해진 유형의 데이터만 저장할 수 있다.
		
		double[] d = {10.5, 10.6, 12.5, 12.6};

		//배열을 사용할 때는 indexing을 한다.
		System.out.println(d[3]);
		
		//배열의 모든 데이터를 출력
		for(int i = 0; i <= 3; i++) {
			System.out.println(d[i]);
		}
		
		
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum += score[i];
		}
		System.out.println(sum);
	}

}
