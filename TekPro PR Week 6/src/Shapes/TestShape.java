package Shapes;

public class TestShape {
	public static void main(String[] args){
		Shape a = new Shape();
		Shape b = new Shape("Aquamarine",false);
		
		a.setColor("Gold");
		System.out.println(a.toString());
		if(b.isfilled()){
			System.out.println(b.toString());	
		}
		b.setfilled(true);
		if(b.isfilled()){
			System.out.println(b.toString());	
		}
	}

}
