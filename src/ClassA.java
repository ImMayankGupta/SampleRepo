
public class ClassA {
	
	public static String author;
	
	ClassA(){
		author="Mayank";
		//System.out.println("In Class A constructor");
	}
	
	ClassA(String name){
		author = name;
	}
	
	public static void methodA(){
		//System.out.println("In Class A method A");
		System.out.println("author="+author);
	}
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.methodA();
		
		
		ClassA b = new ClassA("Habib");
		b.methodA();
	}
	

}
