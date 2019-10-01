/**
 * 
 */
package fr.htc.java;
/**
 * 
 * @author s.taleb
 * 
 */
public class HelloWorld {
/**
 * 
 * @param args
 */
	public static int main(String[] args) {
		// TODO Auto-generated method stub
		String fromName = "Personne";
		String toName = "personne";
		if (args.length > 0) {
			fromName = args[0];
		}
		if (args.length > 1) {
			toName = args[1];
		}
		System.out.println("Hello " + fromName + " from " + toName);
		return 0;
	}

}
