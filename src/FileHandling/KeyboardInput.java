package FileHandling;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {

	public static void main(String[] args) throws IOException {
		bufferedReader();
		readFromConsole();
		readNamePassword();//read name and password using console class
	}
	public static void bufferedReader() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter your name");
		String name = br.readLine();
		
		System.out.println(name);
	}
	public static void readFromConsole() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);		
		
		String data = "";
		while(!data.equals("end")){
			System.out.println("Enter data");
			data = br.readLine();
			System.out.println(data);
		}
		
		br.close();
		isr.close();
	}
	public static void readNamePassword(){
		Console console =System.console();  
		System.out.println("Enter your name: ");  
		String n=  console.readLine();  
		System.out.println("Welcome "+n);  
//		Console c=System.console();  
//		System.out.println("Enter your name: ");  
//		String n=c.readLine();  
//		//String name = c.readLine();
//		
//		System.out.println("Enter Password");
//		char[] password = c.readPassword();
//		
//		System.out.println("Welcome :" + n +  ", Your password is : "+ String.valueOf(password));
		
	}
}
