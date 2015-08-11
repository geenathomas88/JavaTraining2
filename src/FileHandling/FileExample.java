
package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		File file1 = new File("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\anu.jpg");
		File file2 = new File("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\anu1.jpg");
		
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		
		int i;
		while((i = fis.read()) != -1){
			fos.write((byte)(i));
		}
		System.out.print("Done");
		fis.close();
		fos.close();
	}

}
