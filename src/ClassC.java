
public class ClassC extends ClassB{
	
	public void methodC(){
		ClassB b = new ClassB();
		b.methodB();
		System.out.println("In Class C method C");
	}

}
