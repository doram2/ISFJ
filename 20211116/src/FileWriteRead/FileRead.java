package FileWriteRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("out.txt");
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		//���� �Ȱ����� ���۸� �����̾���.
		
		while(true) {
			String line = br.readLine(); //�� ������ �о��
			if(line == null)break;
			System.out.println(line);
		}
	}

}
