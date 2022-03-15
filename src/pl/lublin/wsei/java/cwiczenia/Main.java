package pl.lublin.wsei.java.cwiczenia;

public class Main {

    public static void main(String[] args) {

        System.out.print("Ala\n");
        System.out.print("ma\n");
        System.out.print("kota\n");

        int a = 3;
        double b = 5.26;
        String s = "Nazywaliśmy to „witaminą B3”";

        System.out.printf("a = %d, b= %.2f, s = %20s %n",a,b,s);


        System.out.printf("alfa\tsin(alfa)\n");

        for (int i = 0; i < 370; i += 10)
            System.out.printf("%d\t%f\t\t\n", i, Math.sin(i/360.0*2*Math.PI));


    }
}
