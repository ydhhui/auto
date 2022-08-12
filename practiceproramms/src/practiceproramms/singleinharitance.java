package practiceproramms;
//suppose i have create another class
 class tree{
	public void plants() {
		System.out.println(" i am from plants method & class tree");
	}
	public void animal() {
		System.out.println(" i am from animal method & class tree");
	}
}

public class singleinharitance extends tree {
	public void display() {
		System.out.println(" i am from display method & child class single");
	}
	public static void print() {
		System.out.println(" i am from print method & child class");
	}

	public static void main(String[] args) {
		singleinharitance obj=new singleinharitance();
		obj.plants();
		obj.animal();
		obj.display();
		singleinharitance.print();
		// TODO Auto-generated method stub

	}

}
