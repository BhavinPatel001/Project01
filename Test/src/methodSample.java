
public class methodSample {

// Login Method
	public void login () {
		// Statement
		System.out.println("This is Login Method.");
	}
// Create Account Method	
	public void CreateAccount () {
		// Statement
		System.out.println("This is Create Account Method.");
	}
// Logout Method	
	public void logout () {
		// Statement
		System.out.println("This is Logout Method.");
	}
	
// Add Method
	public void add(int a, int b) {
		int c=a+b;
		System.out.println(c);
	}
// Subtraction
	public int  sub(int d, int e) {
		int f=d-e;
		//System.out.println(f);
		return f;
	}
	
// Multiplication
	public static void multi(int a, int b){		
		int c=a*b;
		System.out.println(c);
	}
	
	
// Main Method	
	public static void main(String[] args) {
		methodSample s1=new methodSample();
		s1.login();
		s1.CreateAccount();
		s1.logout();
		s1.add(2,2);
		s1.add(1000,12324);
		int g=s1.sub(10, 5);
		System.out.println(g);
		
		methodSample.multi(4, 5);
	}

}
