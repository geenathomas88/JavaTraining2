package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		 persist();
		 depersist();
	}
	public static void persist() throws IOException{
		FileOutputStream fos = new FileOutputStream("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\s1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s1 = new Student("Geena", 1, 1, 'A');
		oos.writeObject(s1);
		oos.close();
		System.out.println("success");
	}
	public static void depersist() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream("C:\\Users\\MP-04AZ48-PC\\Desktop\\Training\\s1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s = (Student)ois.readObject();
		System.out.println("Name : " +s.name + ", Id: " + s.id + ", Level : "+ s.level + " , Grade : " + s.grade);
		ois.close();
	}
}
class Student implements Serializable{
	String name;
	int id,level;
	char grade;
	
	public Student(){
		
	}
	
	public Student(String name, int id, int level, char grade) {
		super();
		this.name = name;
		this.id = id;
		this.level = level;
		this.grade = grade;
	}
	
	
}