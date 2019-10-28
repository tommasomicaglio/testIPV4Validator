package tommaso;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        String input = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci l'indirizzo IP");
        input = scan.nextLine();
    }//main

    public static boolean Check(String input){
        String[] controllo = input.split("\\.");
        if (controllo.length == 4) {
            for (int i = 0; i < controllo.length; i++) {
                if (Integer.parseInt(controllo[i]) > 255) {
                    System.out.println("Input errato: Valore superiore a 255");
                    System.exit(0);
                }
            }//controllo valori singoli indirizzo IP
            return true;
        } else {
            return false;
        }//controllo lunghezza
    }
}
