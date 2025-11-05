// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int A = (int)(Math.random() * 100);
		int B = (int)(Math.random() * 100);
		int C = (int)(Math.random() * 100);
		int MaxNum = Math.max(Math.max (A, B),C); 
		int MinNum = Math.min(Math.min(A, B), C);
		int Middle = (A + B + C - MinNum - MaxNum);
		System.out.println(B + " " + A + " " + C);
		System.out.println(MinNum + " " + Middle + " " + MaxNum); 


	}
}
