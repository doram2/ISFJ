
public abstract class Ex01 {
	int first; //����ʵ�
	//������
	public Ex01(int first) {
		this.first = first;
	}//Ex01�� ��ü ������ ���ϴϱ� �����ڰ� �ʿ����
	//�߻�޼ҵ�: ���ǵǾ� ���� �ʰ� �޼ҵ�� ������ �ִ� �޼ҵ�
	public abstract void method01();
	//�Ϲݸ޼ҵ�
	public void method02() {
		System.out.println("Ex01-method");
	}
}
