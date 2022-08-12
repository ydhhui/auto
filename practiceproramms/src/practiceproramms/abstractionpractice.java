package practiceproramms;
abstract class firstprogramm{
	//one abstract method--normal method--static method--
	public void display() {
		System.out.println(" i am from display normal method");
	}
	public static void print() {
		System.out.println(" i am from print static method ");
	}
	public abstract void hide();
}

public class abstractionpractice extends firstprogramm{
	public void display() {
		System.out.println("i am from display method & normal class");
	}

	public static void main(String[] args) {
		firstprogramm obj=new abstractionpractice();
		obj.display();//from abstract class
		obj.hide();//from abstract but implement in child class
		firstprogramm.print();//from abstract class 
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		System.out.println(" now in that class i am implemented");
		// TODO Auto-generated method stub
		
	}

}
