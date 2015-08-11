//read from a file
package FileHandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadFile {
	public static void main(String[] args) throws IOException{
		
		inputStream();//read primitive values
		bufferedInput();//read textual information witha  buffer
		bufferedReader();
		sequenceInputStream();//read data from multiple streams
		fileReader();//read data from text files.
	}
	
	public static void inputStream() throws IOException{
		File file = new File("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\sample.txt");
		
		FileInputStream fis = new FileInputStream(file);
		int content;
		
		while((content = fis.read()) != -1){
			System.out.print((char)(content));
		}
		System.out.println();
		fis.close();
	}
	public static void bufferedInput() throws IOException{
		File file = new File("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\sample.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		int a;
		while((a = bis.read())!= -1){
			System.out.print((char)(a));
		}
		System.out.println();
		fis.close();
	}
	
	public static void bufferedReader() throws IOException{
		File file = new File("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\sample.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		while((str = br.readLine()) != null){
			System.out.print(str);
		}
		System.out.println();
		br.close();
	}
	
	public static void sequenceInputStream() throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\f1.txt");
		FileInputStream fis1 = new FileInputStream("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\f2.txt");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\sample.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis, fis1);
		int i;
		while((i = sis.read())!= -1){
			fos.write(i);
		}
		System.out.println("Done");
		fis.close();
		fis1.close();
		fos.close();
	}
	public static void fileReader() throws IOException {
		FileReader fr = new FileReader("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\sample.txt");
		int i;
		while((i =fr.read())!= -1){
			System.out.print((char)i);
		}
		System.out.println("Done");
		fr.close();
	}

}
