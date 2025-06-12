
public class Swap {

	public static void main(String[] args) {
		int a=50;
		int b=80;
		
		System.out.println("a before swap = "+ a );
		System.out.println("b before swap = "+ b );
		
		a=a+b; 
		b=a-b; 
		a=a-b;
		
		System.out.println("a after swap = "+ a );
		System.out.println("b after swap = "+ b );
		

	}

}
