// Writw a program to implement Abstraction using Interface

interface Myinterface{
	int a = 45;
	// methods without implementation
	void disp();
	void show();
}

class My implements Myinterface{

	public void disp(){ System.out.println("Method defined..."); }
   	public void show(){ System.out.println("Method defined..."); }
}

public class Interface {
	public static void main(String[] args) {

		Myinterface m = new My();

		// can create properties in interfaces
		System.out.println(m.a);
		// can't modify properties in interfaces
		// m.a = 100;

		m.disp();
		m.show();
	}
}
