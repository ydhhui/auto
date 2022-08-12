package practiceproramms;
//it is combination of herrachy and also mutiple inheritance
//but one class will be there & also two interface & also one class
//class to class extends & also interface to interfcae extends and also implements both method in class
class tata{
	public void print0() {
		System.out.println(" i am from printo methopd & also from tata class");
	}
	public void display0() {
		System.out.println(" i am from class tata & display0 method");
	}
	
	
}
interface fourwheeler{
	public void display();
	public void print();
}
interface twowheeler{
	public void display1();
	public void print1();
}

public class hybrid_interface extends tata implements fourwheeler,twowheeler {
	//

	public static void main(String[] args) {
		hybrid_interface obj=new hybrid_interface();
		obj.display();
		obj.display1();
		obj.display0();
		obj.print();
		obj.print0();
		obj.print1();
		// TODO Auto-generated method stub

	}

	@Override
	public void display1() {
		System.out.println(" i am from display1& now implemented");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print1() {
		System.out.println(" i am from prin1 & now i am implemented");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println(" i am from display & now i amimplemented");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		System.out.println(" i am from print method & now i am implemented");
		// TODO Auto-generated method stub
		
	}

}
