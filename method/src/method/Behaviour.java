package method;

public class Behaviour {

	public void m1 () { //m1 non static
		System.out.println (" jvm read 1");
			}
			public static void m2 () { ///m2 static 
			    System.out.println (" jvm read 2");
			}
			
			
			public static void main (String[] args) {
			System .out.println (" jvm read 3");
			m2();
			
			Behaviour babu = new Behaviour (); // object 
			babu.m1();

	    }
			
	}

