package batch_35;

public class ClassB extends ClassA{

	void display() {
		System.out.println("hi");
		super.meth4();
	}
	public static void main(String[] args) {
		
		new ClassB().display();
	}

}
