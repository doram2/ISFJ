
public class Ex13 {

	public static void main(String[] args) {
		//3행4열인 2차원배열에 1~100의 랜덤값 할당
		int[][] arr = new int[3][4];
		int sum = 0;
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = (int)(Math.random()*100 + 1);
				System.out.print(arr[row][col]+" ");
				sum += arr[row][col];
			}
			System.out.println();
		}//for-each문으로 값을 저장할 수는 없음
		
		System.out.println(sum);
		
		sum = 0;
		int[] score = {60,89,56,73,66,90,95};
		for(int i: score) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(sum/score.length);

	}

}
