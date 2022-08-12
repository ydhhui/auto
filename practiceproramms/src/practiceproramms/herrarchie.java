package practiceproramms;
class gas{
	
	public void liquidgas(){
		System.out.println("i am from liquidgas method & from gas class");
	}
}
class lpg extends gas{
	public void lqiuidgas2() {
		System.out.println(" i am from liquidgas2 method & from lpg classs");
	}
	
	
	
	
	
}





public class herrarchie extends gas {
	public void liquidgas3() {
		System.out.println(" i am from liquidgas3 method& herrachie");
	}

	public static void main(String[] args) {
		herrarchie obj=new herrarchie();
		obj.liquidgas();
		obj.liquidgas3();
		//obj.liquidgas2();
		lpg obj1=new lpg();
		obj1.liquidgas();
		obj1.lqiuidgas2();
		// TODO Auto-generated method stub

	}

}
