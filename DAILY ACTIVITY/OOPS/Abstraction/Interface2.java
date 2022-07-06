// Write a program to show interface inheritance

interface First {
	void disp();
}
interface Second {
	void show();
}

// implementing multiple interfaces at a time
class Interfacetest implements First,Second {

	// implementing methods of interfaces
	public void disp(){
		System.out.println("First method...");
	}
	public void show(){
		System.out.println("Second method...");
	}
}
public class Interface2 {
	public static void main(String[] args) {

		Interfacetest i = new Interfacetest();
		i.disp();
		i.show();
	}
}
