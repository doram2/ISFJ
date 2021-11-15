package runtime_exception;

public class ArrayException {

	public static void main(String[] args) {
		int[] i = {1,2,3,4};
		for(int j = 0; j <= i.length; j++) {
			try {
				System.out.println(i[j]);
			}
			catch(ArrayIndexOutOfBoundsException e) {//배열의 크기를 넘어설 때 발생
			
			}
		}

	}

}
