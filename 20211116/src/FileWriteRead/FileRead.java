package FileWriteRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("out.txt");
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		//둘이 똑같은데 버퍼를 더많이쓴다.
		
		while(true) {
			String line = br.readLine(); //행 단위로 읽어옴
			if(line == null)break;
			System.out.println(line);
		}
	}

}
