package FileWriteRead;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("out1.txt");
		fw.write("1 번째입니다.\n");
		fw.write("2 번째입니다.\n");
		fw.write("3 번째입니다.\n");
		fw.write("4 번째입니다.\n");
		fw.write("5 번째입니다.\n");
		for(int i = 1; i <= 10; i++) {
			fw.write(i+"번째 입니다.\n");
		}
		fw.close();
		
	}

}
