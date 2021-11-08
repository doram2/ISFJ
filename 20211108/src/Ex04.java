
public class Ex04 {

	public static void main(String[] args) {
		//배열의 크기 .length
		int[] i = new int[] {1,2,3,4,5};
		System.out.println(i.length);
		
		int sum = 0;
		for(int j = 0; j < i.length; j++) {
			sum += i[j];
		}
		System.out.println(sum);
		
		
		//크기가 10인 배열을 만들고 Math.random을 이용하여 배열에 임의의 값을 저장하시오
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
