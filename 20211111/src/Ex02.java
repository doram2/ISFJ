
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
	/* setter를 통해서 값을 변경할 수 없다.
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
	public int getFirst() { //값을 전달할 수는 있음
		return first;
	}
	public int getSecond() {
		return second;
	}
	

	
}
