
public class Ex07Test {

	public static void main(String[] args) {
		
		//Ex07 ex07 = new 생성자()
		
		Ex07 ex07 = new Ex07(20, 10); //매개변수가 존재하는 생성자
		ex07.add();
		System.out.println(ex07.getResult());
		
		Ex07 ex071 = new Ex07(); //default 생성자
		ex07.setFirst(100);
		ex07.setSecond(50);
		
		Ex071 ex007 = new Ex071(); //default 생성자
		ex007.setFirst(30);
		System.out.println(ex007.getFirst());
	}

}
