package runtime_exception;

public class ClassNotFountException {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.util.List");
			System.out.println("Ŭ������ �ֽ��ϴ�.");
		} catch (ClassNotFoundException e) /*�ڷ���, ����*/{
			e.printStackTrace();//��������� Ȯ���ϱ� ���� �ڵ�
			System.out.println("Ŭ������ �����ϴ�.");
		}
		System.out.println("���α׷� ��");
	}

}
