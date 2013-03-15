/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Szparag
 */
public class JavaApplication3 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		int i;
		for (i = 0; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}
