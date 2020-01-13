
 class ClassB extends ClassA{
	 
	 ClassB(){
		 String author="Habib";
		 System.out.println("In Class B constructor");
	 }
	
	public void methodB(){
		ClassA a = new ClassA();
		a.methodA();
		System.out.println("In Class B method B");
	}

}
