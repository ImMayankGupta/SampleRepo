
public class MethodOverloading {

	public static void main(String[] args) {
		add(5,10,15);
		add(5,10);
		add(5,10,15);
		add(5,10);
		
		add(5,10,15);
		add(5,10);
		add(5,10,15);
		add(5,10);
		
		add(5,10,15);
		add(5,10);
		
		add(5,10,15);
		add(5,10);
		
		add(5,10,15);
		add(5,10);add(5,10,15);
		add(5,10);
		
	}
	
	
	
	
	public static int add(int a,int b) {
		System.out.println("In first method");
		return a+b;
	}
	
	
	public static int add(int a, int b,int c) {
		System.out.println("In Second method");
		return a+b+c;
	}

}
