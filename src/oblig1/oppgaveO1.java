package oblig1;
import java.util.Scanner;

public class oppgaveO1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn din bruttolønn: ");
		double bruttolonn = Integer.parseInt(input.nextLine());
		double[] sats = {0,0.017,0.04,0.134,0.164,0.174};
		double[] lonn = {190350,267900,643800,969200,2000000};
		double skatt = 0.0;
		
		if(bruttolonn < lonn[0]) {skatt = 0;}
		else if (bruttolonn < lonn[1]) {skatt = (bruttolonn - lonn[0])*sats[1];}
		else if (bruttolonn < lonn[2]) {skatt = (lonn[1]-1-lonn[0])*sats[1] + (bruttolonn - lonn[1])*sats[2];}
		else if (bruttolonn < lonn[3]) {skatt = (lonn[1]-1-lonn[0])*sats[1] + (lonn[2]-1 - lonn[1])*sats[2] + (bruttolonn - lonn[2])*sats[3];}
		else if (bruttolonn < lonn[4]) {skatt = (lonn[1]-1-lonn[0])*sats[1] + (lonn[2]-1 - lonn[1])*sats[2] + (lonn[3]-1 - lonn[2])*sats[3] + (bruttolonn - lonn[3])*sats[4];}
		else if (bruttolonn >= lonn[4]) {skatt = (lonn[1]-1-lonn[0])*sats[1] + (lonn[2]-1 - lonn[1])*sats[2] + (lonn[3]-1 - lonn[2])*sats[3] + (lonn[4]-1 - lonn[3])*sats[4] + (bruttolonn - lonn[4])*sats[5];}
		
		System.out.println("Trinnskatten din blir " + skatt + "kr.");
	}

}