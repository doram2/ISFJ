package FileWriteRead;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	//byte�� ����
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("out.txt");
		output.write("1 ��°�Դϴ�.\n".getBytes()); //byte type. 1byte�� ����
		output.write("2 ��°�Դϴ�.\n".getBytes());
		for(int i = 1; i <= 10; i++) {
			String data = i+"��°�Դϴ�.\n";
			output.write(data.getBytes());
		}
		output.close();
	}

}
