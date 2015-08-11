
public class Operators {
	public static void main(String args[])
	{
		
		//unary operators
		System.out.println("-----------unary operators-------------");
		int a=7;
		System.out.println("value of a "+ a);
		System.out.println("Pre Increment "+ a++);
		System.out.println("Post Increment "+ ++a);
		System.out.println("Pre Decrement "+ a--);
		System.out.println("Post Decrement "+ --a);
		
		//bitwise operators
		System.out.println("-----------bitwise operators-------------");
		int x= 10, y=11;
		System.out.println("x And y gives "+ (x&y));
		System.out.println("x OR y gives "+ (x|y));
		System.out.println("x left shift y gives "+ (x<<y));
		System.out.println("x right shift y gives "+ (x>>y));
		System.out.println("x compliment "+ (~x));
		
		//logical operators
		System.out.println("-----------logical operators-------------");
		boolean b = true, c= false;
		System.out.println("b && c "+ (b&&c));
		System.out.println("b || c "+ (b||c));
		System.out.println("!(b && c) "+ !(b&&c));

		//ternary operator
		System.out.println("-----------ternary operator-------------");
		int i = 42;
		System.out.println(i < 40 ? "life" :"Everything");
	}
}
