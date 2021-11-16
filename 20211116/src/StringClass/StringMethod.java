package StringClass;

public class StringMethod {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		//			  01234567890123
		//					1
		char ch = ssn.charAt(7);
		switch(ch) {
		case'1':
		case'3': System.out.println("����"); break;
		case'2':
		case'4': System.out.println("����"); break;
		}
		System.out.println(ssn.charAt(7));
		
		String str = "���� �ڹٰ� �ʹ� ����־��.";
		//			  01 2345678 9012345
		//						  1
		System.out.println(str.charAt(10));
		//charAt(index): index�� �ش��ϴ� ���ڸ� ������
		
		//Method ����
		String str1 = "apple";
		boolean b1 = str1.startsWith("ap");
		System.out.println(b1);
		b1 = str1.startsWith("le");
		System.out.println(b1);
		
		b1 = str1.endsWith("le");
		System.out.println(b1);
		
		str = new String("java");
		str1 = new String("java");
		System.out.println(str1 == str); //false
		System.out.println(str1.equals(str));
		
		str1 = "I like the java";
		//		012345678901234
		//				  1
		System.out.println(str1.indexOf("t"));
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("a"));
		System.out.println(str1.length());
		System.out.println(str1.indexOf("y"));
		
		int[] ii = new int[5];
		System.out.println(ii.length); //�迭�� ��ȣx
		
		//I�� We�� ġȯ
		System.out.println(str1.replace("I", "We"));
		//I�� You�� ġȯ: �ַ� ����ǥ���� ���
		System.out.println(str1.replaceAll("I", "You")); 
		
		str = "A:B:C:D:abcd";
		String[] str2 = str.split(":"); //split �� �迭�� ����
		System.out.println(str2[1]);
		
		
		//slicing: a = "abcdef": a[1:3]: substring
		str1 = "abcdef";
		System.out.println(str1.substring(1, 1+2)); //index 1���� �α���
		
		str1 = "abcDEF";
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		Integer i = 10;
		str = "10" + i.toString();
		System.out.println(str);
		
		str1 = " abc DEF "; //strip
		System.out.println(str1.trim());
		
		str1 = "I like the java";
		//		012345678901234
		//				  1
		int start = str1.indexOf("t");
		System.out.println(str1.substring(start, start + 8));
		System.out.println(str1.substring(start));
		
		str = "A:B/C-D,abcd";
		str2 = str.split(":|/|-|,");
		System.out.println(str2[0]);
		
	}

}
