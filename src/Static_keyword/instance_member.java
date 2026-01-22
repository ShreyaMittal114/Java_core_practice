package Static_keyword;

public class instance_member {

	public static void main(String[] args) {
		Myobject o1= new Myobject();
		Myobject o2= new Myobject();
		System.out.println(Myobject.n);
		// static variable ki ek hi copy bnti hai and it is made even before main
		o1.c=3;
		o2.c=4;
		System.out.println(o1.c);
		System.out.println(o2.c);
		System.out.println(o1.c);
		

	}
}
	
	class Myobject{
		 static int n ;
		int c ; // default value is c=0;
		
//		object(){
//			System.out.println("Constructor")
//		}
//		
//		object(int a, int b){
//			a=n;
//			c=b;
//		}
	}


