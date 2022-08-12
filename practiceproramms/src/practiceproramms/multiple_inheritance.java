package practiceproramms;
class family {
	public void display2() {
		System.out.println(" i am from family method & class family");
	}
	public void print2 () {
		System.out.println(" i am from print method & from class family");
	}
}
class familysecond extends family{
	public void display1() {
		System.out.println(" i am from display method & family second class");
	}
	public void print1() {
		System.out.println(" i am from method print & from family second class");
	}
}
public class multiple_inheritance extends familysecond {
	public void display () {
		System.out.println(" i am from method dispay & from multiple class");
	}
	public void print () {
		System.out.println("i am from print method & from multiple classs");
	}

	public static void main(String[] args) {
		multiple_inheritance obj=new multiple_inheritance();
		obj.display();
		obj.print();
		obj.display1();
		obj.display2();
		obj.print1();
		obj.print2();
		
		// TODO Auto-generated method stub

	}

}
