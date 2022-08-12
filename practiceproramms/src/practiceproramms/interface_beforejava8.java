package practiceproramms;
//now we can study interface before java 8 & after java 8 how it can be works 
//now i am create one of the interface for java 8 programme
interface animal{

	//always contain method hiding
	public void display();//one method
	//public static void print();//whenver the method becomes static or default then it rerquires method body will be there
	public void print();
	
	
}
//now i am creating multiple interface will be here
//so i am create another interface and implements those interface in to the main class
interface jungle{
	public void display1();//method representation without implementation
	public void print1();//that concepet also we can called as a method hiding concept
}

public class interface_beforejava8 implements animal,jungle {

	public static void main(String[] args) {
		interface_beforejava8 obj=new interface_beforejava8();
		obj.display();
		obj.display1();
		obj.print();
		obj.print1();;
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display1() {
		System.out.println(" i am from display1 method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print1() {
		System.out.println("i am from print1 method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println(" i am from display method");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println(" i am from print method");
		// TODO Auto-generated method stub
		
	}

}
