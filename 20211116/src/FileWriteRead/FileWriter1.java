package FileWriteRead;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("out1.txt");
		fw.write("1 ��°�Դϴ�.\n");
		fw.write("2 ��°�Դϴ�.\n");
		fw.write("3 ��°�Դϴ�.\n");
		fw.write("4 ��°�Դϴ�.\n");
		fw.write("5 ��°�Դϴ�.\n");
		for(int i = 1; i <= 10; i++) {
			fw.write(i+"��° �Դϴ�.\n");
		}
		fw.close();
		
	}

}
