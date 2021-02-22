package Dita.Trivia;

public class DynamicDispatch {
	public static void main (String [] args) {
		B b = new B();
		C c = new C();
		A a = new A();
		
		b.callthis();	// Inside class B's method!
		c.callthis();	// Inside class C's method!
		a.callthis();	// Inside class A's method!
		
		A ref;
		ref = b;
		ref.callthis();	// Inside class B's method!
		ref = c;
		ref.callthis();	// Inside class C's method!
		ref = a;
		ref.callthis();	// Inside class A's method!
		
		// Cann't convert along child class 
//		B e = new C();
//		C f = new B();
		// Cann't convert from parent to child class 
//		B e = new A();
//		C f = new A();
		// Can convert from child to parent class
		// Because child inherits parent not otherwise
//		A e = new C();
//		A f = new B();
		
		B ref2;
		ref2 = b;
		ref2.callthis();	//Inside class B's method!
//		ref2 = c;
//		ref2.callthis();	//None of both parent
//		ref2 = a;
//		ref2.callthis();	//Can't convert to child
	}
	
}
