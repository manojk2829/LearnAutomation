package deletePractise;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value -- > ");
		int a=s.nextInt();
		int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a =" + a +"  "+ "b =" + b);
	}

}
