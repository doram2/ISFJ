
public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone ex = new DmbCellPhone("�ڱ���","����",5);
		//�θ�κ��� ��ӹ��� �޼��� ���
		ex.powerOn();
		ex.bell();
		ex.sendVoice("��������");
		ex.receiveVoice("����ľ� ��Ű���");
		ex.sendVoice("�ȳ��ϼ���");
		ex.hangUp();
		
		//�ڽ� Ŭ���� �޼��� ����
		ex.turnOnDmb();
		ex.changeChannelDmb(12);
		ex.turnOffDmb();
	}

}
