
public class Ex13 {

	public static void main(String[] args) {
		//3��4���� 2�����迭�� 1~100�� ������ �Ҵ�
		int[][] arr = new int[3][4];
		int sum = 0;
		
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = (int)(Math.random()*100 + 1);
				System.out.print(arr[row][col]+" ");
				sum += arr[row][col];
			}
			System.out.println();
		}//for-each������ ���� ������ ���� ����
		
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
