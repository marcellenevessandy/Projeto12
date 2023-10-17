package javaapplication20;

import static java.awt.PageAttributes.MediaType.C;
import java.util.Scanner;

public class JavaApplication20 {

    private static Scanner Scanner;

    public static void main(String[] args) {
        int a, b, c;

        Scanner ler =  new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor; ");
        a = ler.nextInt();
        System.out.println("Informe o segundo valor; ");
        b = ler.nextInt();

        if (a == b) {
            c = a - b + 2;

        } else {
            c = a + b + 2;

        }
        System.out.println("O resultado é: " + C);
    }

}
