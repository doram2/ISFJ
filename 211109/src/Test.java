
public class Test {

	public static void main(String[] args) {
		Board board = new Board(1, "����", "�����","����","192.168.0.100",2);
		System.out.println("����: "+board.getSubject());
		System.out.println("�۾���: "+board.getWriter());
		System.out.println("����: "+board.getContent());
		System.out.println("ip: "+board.getIp());
		System.out.println("�湮�� ��: "+board.getReadCount());
	
		System.out.println();
		
		Car car = new Car("����","�ҳ�Ÿ","����",240);
		Car car1 = new Car();
		car1.setColor("���");
		car1.setCompany("���");
		car1.setModel("K7");
		car1.setMaxSpeed(200);
		
		System.out.println("������: "+car1.getCompany());
		System.out.println("�𵨸�: "+car1.getModel());
		System.out.println("����: "+car1.getColor());
		System.out.println("�ӷ�: "+car1.getMaxSpeed());
	
	}

}
