
public class Board {
	//글 번호, 글 제목, 글쓴이, 내용, 글쓴이의 ip주소, 방문자 수
	int num;
	String subject;
	String writer;
	String content;
	String ip;
	int readCount;
	
	public Board() {}
	public Board(int num, String subject, String writer, String content, String ip, int readCount) {
		this.num = num;
		this.subject = subject;
		this.writer = writer;
		this.content = content;
		this.ip = ip;
		this.readCount = readCount;
	}
	public int getNum() {
		return num;
	}
	public String getSubject() {
		return subject;
	}
	public String getWriter() {
		return writer;
	}
	public String getContent() {
		return content;
	}
	public String getIp() {
		return ip;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
}
