
public class Ex07 {

	public static void main(String[] args) {
		char ch1 = 'A' + 1;
		//		2byte + 2byte ����+����
		System.out.println(ch1);
		char ch2 = 'C';
		char ch3 = (char)(ch2 + 1);
		//		4byte + 4byte ����+����			
		System.out.println(ch3);
		
		short sh = 65 + 60; //2byte�� �״�� ��
		short sh1 = 65;
		short sh2 = 60;
		short sh3 = (short)(sh1 + sh2);
		
		float f1 = 10.5f;
		double d1 = 10.6;
		double d2 = d1 + f1;
		
		int result = (int)10.5 + 4;
		System.out.println(result);
		
		/*�ڷ���: 
			������: byte, char, short, int long
			�Ǽ���: float, double
			����: char
			���ڿ�: String
			�ο���: true, false
		*/
		
		char ch = 'a';
		ch = 97;
	}

}
