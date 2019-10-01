package fr.htc.java.heritage;

public class UseCase2 {
	public void meth() {
		System.out.println("Salut");
		
	}


public static void main(String[] args) {
	UseCase2 a= new UseCase2();
	UseCase3 b= new UseCase3();
	
	a.meth();
	b.meth();
	a = b;
	a.meth();
	
}

}