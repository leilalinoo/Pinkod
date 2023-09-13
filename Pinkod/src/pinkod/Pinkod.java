package pinkod;

import java.util.Scanner;
import javax.management.StringValueExp;

public class Pinkod {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String mentettJelszo = Bekeres();
        belepes(mentettJelszo);

    }

    public static String Bekeres() {

        String szam;
        System.out.print("Kód megadása: ");
        szam = sc.nextLine();
        boolean jo = szam.length() > 3 && szam.length() < 7;
        //NumberUtils.isNumber("-123") = true
        /* do{
        System.out.print("Kód megadása: ");
        }while(szam > 4 && szam < 7 && probaSzam < 3);*/

        //boolean helyesFormatum = szamE(szam);
        while (!jo /*&& helyesFormatum != true*/) {
            System.out.print("Kód megadása: ");
            szam = sc.nextLine();
            if (szam.length() > 3 && szam.length() < 7) {
                jo = true;
            }
        }
        System.out.println("Jelszó mentve!\n");

        return szam;
    }

    private static void belepes(String helyesJelszo) {

        int proba = 1;
        System.out.print("Belépés. (" + proba + "/3)  Jelszó: ");
        String jelszo = sc.nextLine();

        while (!jelszo.equals(helyesJelszo) && proba < 3) {
            proba++;
            System.out.print("Téves. (" + proba + "/3) Jelszó: ");
            jelszo = sc.nextLine();
        }
        if (proba < 3) {
            System.out.println("Helyes jelszó!");
        } else {
            System.out.println("Helytelen! Belépés megtagadva.");
        }

    }

    private static void keveres() {
        int[] kevert = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    }

    /*  private static int be2(){
        System.out.print("Kód megadása: ");
        int jel = sc.nextInt();
        String szam = String.valueOf(jel);
        boolean jo = szam.length() > 3 && szam.length() < 7;
        
         while (!jo /*&& helyesFormatum != true) {
            System.out.print("Kód megadása: ");
            szam = sc.nextLine();
            if (szam.length() > 3 && szam.length() < 7) {
                jo = true;
            }
        }
        System.out.println("Jelszó mentve!\n");
        
        return 2;
    }*/

 /*private static boolean szamE(String jelszo) {
        char karakter = '.';
        String betu = "";
        for (int i = 0; i < jelszo.length(); i++) {

        }

        try {
            int a = Integer.parseInt(jelszo);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }*/
}
