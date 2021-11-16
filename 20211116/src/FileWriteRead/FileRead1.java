package FileWriteRead;

import java.io.FileInputStream;
import java.io.IOException;

public class FileRead1 {

	public static void main(String[] args) throws IOException {
		/*¿§Çð*/
		byte[] b = new byte[1024]; // 1kb
		FileInputStream input = new FileInputStream("out1.txt");
		input.read(b); //byte·Î ºÒ·¯¿È
		System.out.println(new String(b));
		input.close();
	}

}
