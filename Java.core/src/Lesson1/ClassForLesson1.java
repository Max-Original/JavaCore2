package Lesson1;

import java.util.Arrays;

public class ClassForLesson1 {
	
	public static void main(String[]args) {
//		int a = 0;
//		int b = a++;
//		int c = a++;
//		System.out.println("text for view "+ a + " " + b + " " + c +" ");
	
		/*
		 * int f = 1; int g = 2; int h = 3;
		 * 
		 * f+=5; g*=4; h+=f*g; h%=6;
		 * 
		 * System.out.println("f = "+f); System.out.println("g = "+g);
		 * System.out.println("h = "+h);
		 */
		
		/*
		 * int a = 2; int r = a > 0 ? 1 : 2; System.out.println(r);
		 */
		
		/*
		 * boolean j = true; boolean k = false; boolean l = j | k; boolean m = j & k;
		 * boolean n = (!j & k) | (j & !k); boolean o = !j;
		 * 
		 * System.out.println(j); System.out.println(k); System.out.println(l);
		 * System.out.println(m); System.out.println(n); System.out.println(o);
		 */
		
		byte a = 1;
		int b = 2;
		short c = 3;
		long d = 4;
		char eeee = 'f';
		String Hello = "Bro";
		boolean yes = true;
		float two = 2.5f;
		double doubletwo = 21.21;
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		
		
		int [] masuv = {1,2,3,4,5,6,7,8,9,10};
		int min = Arrays.stream(masuv).min().getAsInt();
		int max = Arrays.stream(masuv).max().getAsInt();
		System.out.println("min = "+min);
		System.out.println("max = "+max);
	}
}
