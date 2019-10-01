package fr.htc.java.types;

public class JavaPrimitif {

	public static void main(String[] args) {
		/*short s = 32767;
		byte b = 24;
		int i = 0;
		long l = 132456789;
		boolean x=true;
		float r=2^5;
		System.out.println(s);
		System.out.println(b);
		System.out.println(i);
		System.out.println(l);
		System.out.println(x);
		System.out.println(r);*/
		int i = 1;
		System.out.println(8 * ++i);
		System.out.println("i = " + i);
		System.out.println(8 * i++);
		System.out.println("i = " + i);
		System.out.println(8 * i--);
		System.out.println("i = " + i);
		System.out.println(8 * --i);
		System.out.println("i = " + i);
	} 
}
