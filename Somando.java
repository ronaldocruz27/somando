package somando;

import java.util.Scanner;

public class Somando {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = 1;
        int nt = 0;
        int n2;
        

        while (n != 0) {
            System.out.println("Digite um número:");

            n = ler.nextInt();
            nt = nt + n;

            if (n < 0) {
                break;
            }

        }
        n2 = nt+1;
        System.out.println("a soma dos números é:" + n2);
        System.out.println("fim do programa");
    }
}
