
public class Ex12 {

	public static void main(String[] args) {
		//for each: for���� Ȯ�尳��
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		//1���� �迭�� �հ踦 ���Ͻÿ�
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		for(int k: arr) { // k = arr[0], arr[1],... �迭�� ũ�⸸ŭ �ݺ�
			sum += k;
		}
		System.out.println(sum);
	
		
		int ii[][] = {{1,2,3,4},{5,6},{7,8,9,10,11}};
		sum = 0;
		for(int row = 0; row < ii.length; row++) {
			for(int col = 0; col < ii[row].length; col++) {
				sum += ii[row][col];
			}
		}
		System.out.println(sum);
		System.out.println("=========================================");
		
		sum = 0;
		for(int[] row: ii) {//�� �྿ �������迭�� �޾ƿ� row = ii[0], ii[1], ii[2]
			for(int col: row) {//col = row[0](==ii[0][0]), row[1](==ii[0][1]),...
				sum += col;	
			}
		}
		System.out.println(sum);
	
	
	
	
	
	}

}
