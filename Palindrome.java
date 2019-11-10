package trecipaket;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		int n, r = 0, br, novBr = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		n = sc.nextInt();
		br = n;
		while (n > 0) {
			r = n % 10;
			novBr *= 10;
			novBr += r;
			n /= 10;
		}
		if (novBr == br) {
			System.out.println("Uneti broj jeste palindrom.");
		} else {
			System.out.println("Uneti broj nije palindrom.");
		}
	}
}
