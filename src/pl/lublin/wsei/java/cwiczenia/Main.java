package pl.lublin.wsei.java.cwiczenia;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        String d; String e;
        System.out.print("Podaj liczbę w systemie dziesiętnym: ");
        num1 = input.nextInt();
        d = Integer.toHexString(num1);
        e = Integer.toBinaryString(num1);
        System.out.println("DEC = " + num1);
        System.out.println("HEX = " + d);
        System.out.println("BIN = " + e);
    }
private static String leftPad(String aText, char aChar, int aWidth){
    String res = aText;
    for(int i = 0; i < aWidth - aText.length(); i++)
        res = aChar + res;
    return res;
        }

    }
