
public class Ex04 {

	public static void main(String[] args) {
		//�迭�� ũ�� .length
		int[] i = new int[] {1,2,3,4,5};
		System.out.println(i.length);
		
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		
		
		//ũ�Ⱑ 10�� �迭�� ����� Math.random�� �̿��Ͽ� �迭�� ������ ���� �����Ͻÿ�
		int[] arr = new int[10];
		for(int k = 0; k < arr.length; k++) {
			arr[k] = (int)(Math.random()*100+1);
			System.out.print(arr[k]+" ");
		}
		System.out.println();
		sum = 0;
		for(int k = 0; k < arr.length; k++) {
			sum += arr[k];
		}
		System.out.println(sum);
		
		
		
		
		
	}

}
