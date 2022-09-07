package oblig1;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class oppgaveO2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int studs = 10;
		List<Integer> studList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int studATM = 1;
		List<String> list = new ArrayList<>();
		
		for(int i=1;i<=studs;i++) {
			
			System.out.println("Skriv inn poengsum for prøven: ");
			int poengsum = Integer.parseInt(input.nextLine());
			String karakter = "";
			
			if(poengsum < 40) {karakter = "F";}
			else if(poengsum < 50) {karakter = "E";}
			else if(poengsum < 60) {karakter = "D";}
			else if(poengsum < 80) {karakter = "C";}
			else if(poengsum < 90) {karakter = "B";}
			else if(poengsum <= 100) {karakter = "A";}
			
			if(poengsum >= 0 && poengsum <= 100) {
				System.out.println("Karakteren til elev nr." + studATM + ": " + karakter + ", med en poengsum på " + poengsum + ".");
				studATM++;
				list.add(karakter);
			} else {
				System.out.println("Brudda, that poengsum aint even valid.");
				studs+=1;
			}
		}
		input.close();
		System.out.println("\nResultatet for alle elevene blir dermed: \n");
		for(int i = 0; i<10;i++) {
			System.out.println("	Elev nr." + studList.get(i) + ": " + list.get(i));
		}

	}

}
