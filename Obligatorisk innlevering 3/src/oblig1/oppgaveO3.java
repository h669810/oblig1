package oblig1;

import java.util.Scanner;

public class oppgaveO3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Oppgi et heltall større enn 0: ");
		int n = Integer.parseInt(input.nextLine());
		String b = "Rekkefølgen: ";
		
		double i,fact = 1;
		for(i=1;i<=n;i++) {
			fact = fact * i;
			b = b + (int)i + " * ";
		}
		System.out.println(b + "\nn fakultet, der n = " + n + ": " + fact);
	}

}