
public class Ex02 {
	final int first;
	final int second;
	final String GOODS_PRICE; //
	String name;
	public Ex02(int first, int second, String GOODS_PRICE) {
		this.first = first;
		this.second = second;
		this.GOODS_PRICE = GOODS_PRICE;
	}
	/* setter�� ���ؼ� ���� ������ �� ����.
	 * public void setFirst(int first){
	 * 		this.first = first;
	 * }
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getName(String name) {
		return this.name;
	}
	public int getFirst() { //���� ������ ���� ����
		return first;
	}
	public int getSecond() {
		return second;
	}
	

	
}
