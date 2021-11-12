package package01.package001;

public class Board {
	int num;
	String subject;
	String content;
	String writer;
	int readCount;
	
	public Board() {}

	public Board(int num, String subject, String content, String writer, int readCount) {
		super();
		this.num = num;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.readCount = readCount;
	}

	public int getNum() {
		return num;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
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

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	


}


