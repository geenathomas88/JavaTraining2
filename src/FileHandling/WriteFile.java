//write to a file
package FileHandling;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {


	public static void main(String[] args) throws IOException {
		outputStream();//write primitive vaalues
		bytearrayOutputStream();//write data to multiple files with byte array
		bufferedOutputStream();//write textual information with a buffer
		fileWriter();//write data to text files
		charArrayWriter();//write to multiple files
	}
	public static void outputStream() throws IOException{
		File file = new File("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\sample.txt");
		
		String str = "This is a sample program to write a sample file.";
		FileOutputStream fos = new FileOutputStream(file);
		byte[] inBytes = str.getBytes();
		fos.write(inBytes);

		fos.close();
	}
	public static void bytearrayOutputStream() throws IOException{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\f1.txt");
		FileOutputStream fos1 = new FileOutputStream("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\f2.txt");
		
		ByteArrayOutputStream bous = new ByteArrayOutputStream();
		bous.write(89);
		bous.writeTo(fos);
		bous.writeTo(fos1);
		
		bous.close();
	}
	public static void bufferedOutputStream() throws IOException{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\sample.txt");
		BufferedOutputStream  bos= new BufferedOutputStream(fos);
		String s = "Good Morning!!";
		
		byte[] inBytes = s.getBytes();
		bos.write(inBytes);
		System.out.println("Done");
		bos.close();
	}
	public static void fileWriter() throws IOException{
		FileWriter fw = new FileWriter("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\sample.txt");
		fw.write("My name is Geena");
		fw.close();
	}
	public static void charArrayWriter() throws IOException{
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("My name is geena");
		
		FileWriter fw1 = new FileWriter("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\f1.txt");
		FileWriter fw2 = new FileWriter("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\f2.txt");
		FileWriter fw3 = new FileWriter("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\f3.txt");
		
		caw.writeTo(fw1);
		caw.writeTo(fw2);
		caw.writeTo(fw3);
		
		fw1.close();
		fw2.close();
		fw3.close();
		System.out.println("Done");
	}
}
