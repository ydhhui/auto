package practiceproramms;//represents package name
//main class with access modifier public to accesable for all

public class oetimepractice {
	public int var1;//global-instance/nonstatic variable & call with obj creation--only declration --but whwn value will assign then it becomes inilitization
	public static float var2;//static variable with public & gloabl call with class name
//that is the main method inside that all programme execution will start
	//also i can create diffn method 
	public static void display() {
		System.out.println(" i am from display method & without any parameter"); 
	}
	//now one normal method
	public void print(int a) {
		
		System.out.println(" i am from print method=" +a);//print value a by default it becomes zero
	}
	//now i want two parameterised method
	public void horn(int a,float b,long c) {
		System.out.println(" i am from horn method & wit three parameter");
	}
	//nnow i want to create constructor --always write with class name
	public oetimepractice() {
		super();
		System.out.println(" i am from without parameter constructor by super");
	}
	public oetimepractice(int a,int b) {
		System.out.println(" i am from two parameterised constructor");
	}
	//now create three parametrised constructor
	public oetimepractice(int d,int g,int j) {
		System.out.println(" i am from three parameterised constructor");
	}
	public class child  {
		public void string() {
			System.out.println(" i am from child & without parameter");
		}
		public static void dom(int a) {
			System.out.println(" i am from static method & without parametrised wit one int");
		}
		public void statue(int a,int b) {
			System.out.println(" i am from statue method & with two parameter");
		}
		
		public child(int a, int b) {
			super();
			System.out.println(" i am from with two parameter & child construxctor");
		}
		public child(int a, int b,int c) {
			System.out.println(" i am from three parameterised constructor& also from child class");
		}
	}
	public static void main(String[] args) {
		//now i want to call or print variable,method,comstructor then we can create object first
		/*oetimepractice obj=new oetimepractice();
		oetimepractice obj2=new oetimepractice(10, 20);
		oetimepractice obj3=new oetimepractice(10, 20, 30);
		obj.var1=10;
		oetimepractice.var2=10f;// TODO Auto-generated method stub because it iss static variable
		obj.print(10);
		oetimepractice.display();
		obj.horn(12, var2, 20);*/
		
		
		
	
		

	}

}
